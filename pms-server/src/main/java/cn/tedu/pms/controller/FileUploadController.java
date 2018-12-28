package cn.tedu.pms.controller;


import cn.tedu.pms.utils.FileUploadUtils;
import cn.tedu.pms.utils.MapBuilder;
import cn.tedu.pms.vo.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Smile
 * createdAt 2018/12/27
 **/
@RestController
@RequestMapping("/file-upload")
public class FileUploadController {

    @Autowired
    private FileUploadUtils fileUploadUtils;

    @PostMapping("/user-header")
    public Resp uploadUserHeader(@RequestParam("header") MultipartFile multipartFile) throws IOException {
        FileOutputStream fops = null;
        String requestParam = "123";
        try {
            fops = new FileOutputStream(new File(fileUploadUtils.generateFilePathForUserHeaderUpload(requestParam)));
            StreamUtils.copy(multipartFile.getInputStream(), fops);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fops != null)
                fops.close();
        }
        return Resp.success(new MapBuilder().kv("url", fileUploadUtils.generatePicUrlForUserHeaderUpload(requestParam)));
    }
}