package com.test.gcp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileDto {

   
	private String fileName;
    private String fileUrl;
    
    public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public FileDto(String name, String mediaLink) {
		this.fileName =name;
		this.fileUrl =mediaLink;
	}
}
