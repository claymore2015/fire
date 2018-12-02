package com.claymore.bamder.cybersecurity.material.exception;

/**
 * @author li.zhuo
 * @create 2018/11/19 11:56 PM
 * @since 1.0.0
 */
public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
