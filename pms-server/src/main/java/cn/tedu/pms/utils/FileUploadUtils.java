package cn.tedu.pms.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Smile
 * createdAt 2018/12/27
 **/
@Configuration
public class FileUploadUtils {

    @Value("${server.port}")
    private Integer port;

    @Value("${config.file-upload.host-name:localhost}")
    private String host;

    public static final String BASE_PATH = "E:/pms_imgs";

    public String generateFilePathForUserHeaderUpload(String userId) {
        return BASE_PATH + "/" + userId + ".png";
    }

    public String generatePicUrlForUserHeaderUpload(String userId) {

        return String.format("http://%s:%s", host, port) + generateFilePathForUserHeaderUpload(userId).replaceFirst(BASE_PATH, "");
    }
}