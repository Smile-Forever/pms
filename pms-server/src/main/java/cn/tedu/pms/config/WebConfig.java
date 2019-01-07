package cn.tedu.pms.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;


/**
 * @author Smile
 * Created at 2018/12/28
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean(DispatcherServlet.MULTIPART_RESOLVER_BEAN_NAME)
    public MultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/META-INF/resources/")
//                .addResourceLocations("classpath:/resources/")
//                .addResourceLocations("classpath:/static/")
//                .addResourceLocations("classpath:/templates/")
//                .addResourceLocations("classpath:/templates/")
//                .addResourceLocations("file:/tmp/")
//                .addResourceLocations("classpath:/public/");
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/templates/css/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/templates/js/");
        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/templates/fonts/");
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        final FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        final FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                // 保留值为null的key
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.PrettyFormat
                // 其他属性在这里定制
        );
        fastConverter.setFastJsonConfig(fastJsonConfig);
        fastConverter.setSupportedMediaTypes(Lists.newArrayList(
                MediaType.APPLICATION_JSON_UTF8,
                MediaType.APPLICATION_JSON,
                MediaType.TEXT_PLAIN,
                MediaType.TEXT_HTML
        ));

        converters.add(fastConverter);
    }
}