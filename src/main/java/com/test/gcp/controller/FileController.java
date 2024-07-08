package com.test.gcp.controller;



import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.test.gcp.dto.RequestFileDto;
import com.test.gcp.entity.InputFile;
import com.test.gcp.service.FileService;

import java.util.List;

@RestController
@RequestMapping("/api/files")
@RequiredArgsConstructor
public class FileController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileService fileService;

    @PostMapping()
    public List<InputFile> addFile(@RequestPart(value = "file", required = false) MultipartFile file, @RequestParam(value = "email", required = false) String email){
        LOGGER.debug("Call addFile API");
        RequestFileDto reqFileDto = new RequestFileDto();
        reqFileDto.setEmail(email);
        return fileService.uploadFiles(file, reqFileDto);
    }
}


