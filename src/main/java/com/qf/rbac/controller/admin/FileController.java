package com.qf.rbac.controller.admin;

import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.service.FileService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class FileController {

    @Autowired
    private FileService fileService;

    /**
     * 文件上传
     * @param file
     */
    @ApiOperation("文件上传")
    @PostMapping("/upload")
    public R upload(
            @ApiParam(value = "文件", required = true)
            @RequestParam("file") MultipartFile file,
            @ApiParam(value = "模块", required = true)
            @RequestParam("module") String module) throws IOException {

        // 获得上传文件的 InputStream
        InputStream inputStream = file.getInputStream();
        // 获得上传文件的名字
        String originalFilename = file.getOriginalFilename();
        String uploadUrl = fileService.upload(inputStream, module, originalFilename);

        //返回r对象
        return new R(ResponseEnum.SUCCESS,uploadUrl);
    }



}
