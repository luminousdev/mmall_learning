package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by luminous on 2017/5/11.
 **/
public interface IFileService {

    String upload(MultipartFile file, String path);
}
