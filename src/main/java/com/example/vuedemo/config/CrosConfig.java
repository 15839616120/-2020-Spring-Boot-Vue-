package com.example.vuedemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决前后端分离跨域访问报错问题：
 * 1：Access to XMLHttpRequest at 'http://localhost:8181/book/findAll' from origin 'http://localhost:8080'
 * has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested
 * resource.
 * 2： Uncaught (in promise) Error: Network Error
 *     at createError (createError.js?2d83:16)
 *     at XMLHttpRequest.handleError (xhr.js?b50d:69)
 *
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /**
         * 以下代码为固定代码，粘贴复制即可,一下代码为springboot2.4.X的写法，如果版本发生变化，报错的话，百度即可；
         */
        //对那些请求路径进行跨域处理
        registry.addMapping("/**")
                // 支持的域
                .allowedOriginPatterns("*")
                // 允许的方法，默认允许GET、POST、HEAD
                .allowedMethods("*")
                // 是否允许证书（cookies）
                .allowCredentials(true)
                // 探测请求有效时间，单位秒
                .maxAge(3600)
                // 允许的请求头，默认允许所有的请求头
                .allowedHeaders("*");
    }
}
