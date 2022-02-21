package com.filestorages.filestorage.repository.entity;

import lombok.Data;

@Data
public class FileResponse {

    private long id;
    private String name;
    private Long size;
    private String url;
    private String contentType;

}
