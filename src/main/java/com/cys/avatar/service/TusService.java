package com.cys.avatar.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import org.springframework.util.StringUtils;

import java.io.*;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;;

@Service
public class TusService {

	private Path storageDir;
	private String storagePath;

	@Autowired
	public void StorageServiceImpl(Environment environment){
		//log.debug("STARTING STORAGE SERVICE");

		storagePath = environment.getProperty("tusserver.storagefolder");
		storageDir = Paths.get(this.storagePath);

		File file = new File(storagePath);

		if (!file.isDirectory() && !file.mkdir()){
			// throw new TusStorageException(storagePath, true);
		}
		if (!file.canWrite() || !file.canRead()){
			String message = "Upload directory: " + storageDir + " must be readable and writable";
			// throw new TusPermissionDeniedException(message);
		}
		//log.debug("StorageService started SUCCESFULY");
	}



	public Resource loadResource(String uuid) throws Exception {
		String filename = StringUtils.cleanPath(uuid);

		Resource resource = new UrlResource(storageDir.resolve(filename).toUri());
		if (resource.exists() || resource.isReadable()) {
			return resource;
		}
		else {
			// throw new TusStorageException(filename);
			throw new FileSystemException("");
		}
	}

	public int processStream(String uuid, InputStream inputStream) throws Exception {
		String filename = StringUtils.cleanPath(uuid);
		File file = new File(storageDir.resolve(filename).toString());

		if (!file.isFile()){
			new FileOutputStream(file).close();
			if(!file.isFile()){
				// log.error("Cannot create new file");
				// throw new TusPermissionDeniedException("Cannot create new file");
			}
		}

		InputStream storageFile = null;
		try{
			storageFile = new FileInputStream(file);
		}catch(IOException e){
			// log.error("Cannot read old file");
			// throw new TusPermissionDeniedException("Cannot read old file");
		}

		storageFile = new SequenceInputStream(storageFile, inputStream);
		Files.copy(storageFile, storageDir.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
		file = new File(storageDir.resolve(filename).toString());

		return (int) file.length();
	}
}
