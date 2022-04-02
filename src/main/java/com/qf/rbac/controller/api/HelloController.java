package com.qf.rbac.controller.api;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos
    ) {

        log.info("上传的信息：email={},username={},headerImg={},photos={}", email, username, headerImg.getSize(), photos.length);
        if (!headerImg.isEmpty()) {
            //保存文件到服务器
            String originalFilename = headerImg.getOriginalFilename();
            try {
                headerImg.transferTo(new File("D:\\spring_annation\\file\\" + originalFilename));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (photos.length > 0) {
            for (MultipartFile multipartFile : photos) {
                log.info(multipartFile.getOriginalFilename());
                try {
                    String originalFilename = multipartFile.getOriginalFilename();
                    multipartFile.transferTo(new File("D:\\spring_annation\\file\\" + originalFilename));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "上传成功";
    }


}