package com.claymore.bamder.cybersecurity.material.domian;

/**
 * @author li.zhuo
 * @create 2018/11/19 11:54 PM
 * @since 1.0.0
 */
public class UploadFileResponse {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }
}
