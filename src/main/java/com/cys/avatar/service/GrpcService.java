package com.cys.avatar.service;

import com.cys.grpc.proto.imageconverter.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcService {

    @GrpcClient("imageconverter")
    imageConverterGrpc.imageConverterBlockingStub blockingStub;

    public String convertImage(String type, String imageBase64) {
        UploadImageResponse response = blockingStub.uploadImage(
                UploadImageRequest.newBuilder()
                        .setType(type)
                        .setImageBase64(imageBase64)
                        .build()
        );
        return response.getImageBase64();
    }

    public String convertJson(String type, String imageBase64) {
        UploadJsonResponse response = blockingStub.uploadJson(
            UploadJsonRequest.newBuilder()
                    .setType(type)
                    .setImageBase64(imageBase64)
                    .build()
        );
        return response.getImageJson();
    }
}
