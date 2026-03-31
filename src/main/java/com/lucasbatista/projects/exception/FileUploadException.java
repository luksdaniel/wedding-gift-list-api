package com.lucasbatista.projects.exception;

import software.amazon.awssdk.services.s3.model.S3Exception;

public class FileUploadException extends RuntimeException{
    public FileUploadException(String s, S3Exception e) {
    }
}
