package com.cys.avatar.controller;

import com.cys.avatar.config.TusValidator;
import com.cys.avatar.controller.dto.ConverterEnum;
import com.cys.avatar.controller.dto.UploadResponse;
import com.cys.avatar.service.AvatarService;
import io.undertow.util.BadRequestException;
import me.desair.tus.server.TusFileUploadService;
import me.desair.tus.server.upload.UploadInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.file.Paths;

@RestController
public class AvatarController {

	private final AvatarService avatarService;

	private final TusFileUploadService tusFileUploadService;

	private final TusValidator tusValidator;

	public AvatarController(AvatarService avatarService, TusFileUploadService tusFileUploadService, TusValidator tusValidator) {
		this.avatarService = avatarService;
        this.tusFileUploadService = tusFileUploadService;
        this.tusValidator = tusValidator;
    }

	@PostMapping(value = "/image/upload", produces = "application/json", consumes = "multipart/form-data")
	public ResponseEntity<UploadResponse> uploadImage(@RequestParam(value = "file")MultipartFile file) throws Exception{
		UploadResponse uploadResponse = avatarService.uploadImage(file);
		return new ResponseEntity<>(uploadResponse, HttpStatus.OK);
	}

	@GetMapping(value ="/convert/image")
	public void transferToImage(
		@RequestParam(value ="id", required = true) String id,
		@RequestParam(value ="type", required = true, defaultValue = "KOREAN") ConverterEnum type,
		HttpServletResponse response
	) throws Exception {
		avatarService.transferToImage(id, type.toString(), response);
	}

	@GetMapping(value ="/convert/image/json")
	public String transferToJson(
			@RequestParam(value ="id", required = true) String id,
			@RequestParam(value ="type", required = true, defaultValue = "KOREAN") ConverterEnum type
		) throws Exception {
		return avatarService.transferToJson(id, type.toString());
	}

	@RequestMapping(value = "/tus/image/upload", method = {RequestMethod.POST, RequestMethod.PATCH, RequestMethod.HEAD,
		RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.GET})
	public void prepareUploadWithTus(HttpServletRequest request, HttpServletResponse response) throws Exception{

		tusValidator.validate(request.getHeader("Upload-Length"), response.getHeader("Upload-Metadata"));
		tusFileUploadService.process(request, response);

	}

	@RequestMapping(value = "/tus/image/upload/**", method = {RequestMethod.POST, RequestMethod.PATCH, RequestMethod.HEAD})
	public void uploadWithTus(HttpServletRequest request, HttpServletResponse response) throws Exception{
		tusFileUploadService.process(request, response);
	}

	@PostMapping(value="/tus")
	public ResponseEntity<UploadResponse> tusUploadImage(@RequestBody String id) throws Exception{

		UploadInfo uploadInfo = tusFileUploadService.getUploadInfo("/file/image/"+id);
		if (uploadInfo == null || uploadInfo.isUploadInProgress() || !StringUtils.hasText(uploadInfo.getFileName())) {
			throw new BadRequestException("File Not Found");
		}
		UploadResponse uploadResponse =  avatarService.uploadData(id, uploadInfo.getFileName(),
				Paths.get("/file/image/" + File.separator + uploadInfo.getFileName()));
		return new ResponseEntity<>(uploadResponse, HttpStatus.OK);
	}


}
