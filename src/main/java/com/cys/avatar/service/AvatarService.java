package com.cys.avatar.service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.UUID;

import org.apache.commons.fileupload.FileUploadException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cys.avatar.controller.dto.UploadResponse;
import com.cys.avatar.domain.Resource;
import com.cys.avatar.repository.AvatarRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvatarService {

	private final AvatarRepository avatarRepository;

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
}
