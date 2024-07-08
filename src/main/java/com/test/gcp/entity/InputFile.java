package com.test.gcp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
public class InputFile {

    private Long id;
    private String fileName;
    private String fileUrl;
    
    public InputFile(){
    	
    }
    public InputFile(String fileName, String fileUrl) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
    
    
}




