package com.test.gcp.service;

import com.test.gcp.dto.RequestFileDto;
import com.test.gcp.entity.*;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface FileService {

    List<InputFile> uploadFiles(MultipartFile files, RequestFileDto fileDto);
}
