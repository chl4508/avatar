package com.cys.avatar.config;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import me.desair.tus.server.exception.TusException;

@Slf4j
@Component
public class TusValidator {

    private void validateFileExtension(String uploadMetaDataStr) throws TusException {

        TusFileMetaData metaData = TusFileMetaData.of(uploadMetaDataStr);

        if (metaData == null || !"image/png".equals(metaData.getFileTypeByContentType())) {
            throw new TusException(400 ,"이미지 파일만 업로드 할 수 있습니다.");
        }
    }

    public void validate(String fileSizeStr, String metaDataStr) throws TusException {
        // 파일 확장자 검증
        validateFileExtension(metaDataStr);
    }

    @Getter
    public static class TusFileMetaData {
        private String fileName;
        private String fileType;

        /**
         * ex) filename MzAzNjlfbWFyaWlfMjAyMjU0LmpwZw==,filetype aW1hZ2UvanBlZw==
         * 스트링을 디코딩해서 filename 과 filetype 을 추출한다
         *
         * @param metaDataStr
         * @return
         */
        public static TusFileMetaData of(String metaDataStr) {
            try {
                TusFileMetaData metaData = new TusFileMetaData();
                String[] metadataArr = metaDataStr.split(",");
                for (String s : metadataArr) {
                    if (s.startsWith("filename")) {
                        metaData.fileName = new String(Base64.decodeBase64(s.split(" ")[1]));
                    } else if (s.startsWith("filetype")) {
                        metaData.fileType = new String(Base64.decodeBase64(s.split(" ")[1]));
                    }
                }

                log.debug("method: TusValidator.of(), fileName: {}, fileType: {}", metaData.fileName, metaData.fileType);

                return metaData;
            } catch (Exception e) {
                log.debug("method: TusValidator.of(), e: {}", e.getMessage());
                return null;
            }

        }

        /**
         * fileName 에서 확장자를 추출하거나, 확장자가 없는 파일인 경우 MetaData > fileType 에서 ContentType 으로 확장자 추출한다
         *
         * @return
         */
        public String getFileTypeByContentType() {
            return fileName.contains(".") ? fileName.substring(fileName.lastIndexOf('.')) : null;
        }
    }
}
