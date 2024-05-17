package com.cys.avatar.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.UUID;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cys.avatar.controller.dto.UploadResponse;
import com.cys.avatar.domain.Resource;
import com.cys.avatar.repository.AvatarRepository;

import lombok.RequiredArgsConstructor;
import org.webjars.NotFoundException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

@Service
@RequiredArgsConstructor
public class AvatarService {

	private final AvatarRepository avatarRepository;

	private final GrpcService grpcService;

	@Transactional()
	public UploadResponse uploadImage(MultipartFile file) throws Exception {

		String originalFileName = file.getOriginalFilename();
		String mimeType = file.getContentType();

		//MIMETYPE Check
		if(mimeType == null || mimeType.equals("image/png")) {
			throw new FileUploadException("이미지 파일만 업로드 할 수 있습니다.");
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

		// file upload
		String newFileName = originalFileName+"_"+dateFormat;
		Path filePath = Paths.get("/file/image/" + File.separator + newFileName);
		file.transferTo(filePath);

		return	uploadData(originalFileName,newFileName,filePath);
	}

	public UploadResponse uploadData(String originalFileName, String newFileName, Path filePath) {
		// file db save
		String id = UUID.randomUUID().toString();
		Resource resource = Resource.builder()
			.id(id)
			.originalFileName(originalFileName)
			.newFileName(newFileName)
			.filePath(filePath.toString())
			.build();
		avatarRepository.save(resource);
		return UploadResponse.builder().id(id).build();
	}

	public void transferToImage(String id, String type, HttpServletResponse response) throws Exception{
		String responseImageBase64 = grpcService.convertImage(type, getAvatarImage(id));

		byte[] asBytes = Base64.getDecoder().decode(responseImageBase64);
		InputStream targetStream = new ByteArrayInputStream(asBytes);

		BufferedImage imBuff = ImageIO.read(targetStream);
		response.setHeader("Content-Type", "image/png"+"; charset=UTF-8");
		OutputStream osResponse = response.getOutputStream();
		ImageIO.write(imBuff, "image/png", osResponse);
	}

	public String transferToJson(String id, String type) throws Exception{
		return grpcService.convertImage(type, getAvatarImage(id));
	}

	public String getAvatarImage(String id) throws Exception{
		Resource resource = avatarRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("데이터가 없습니다."));

		InputStream inputStream = Files.newInputStream(Path.of(resource.getFilePath()));
		byte[] bytes = IOUtils.toByteArray(inputStream);
		String imageBase64 = Base64.getEncoder().encodeToString(bytes);
		return Base64.getEncoder().encodeToString(bytes);
	}
}
