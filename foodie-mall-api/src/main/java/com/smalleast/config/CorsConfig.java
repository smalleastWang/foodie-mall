package com.smalleast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.config
 * @Description : 跨域配置
 * @Date 2020/11/27 下午21:15
 **/

@Configuration
public class CorsConfig {

    public CorsConfig() {}

    @Bean
    public CorsFilter corsFilter() {
        // 1.添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http:localhost:8080");
        // 设置是否发送cookie信息
        config.setAllowCredentials(true);
        // 设置允许的请求方式
        config.addAllowedMethod("*");
        // 设置允许的header
        config.addAllowedHeader("*");
        // 2.为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", config);

        return new CorsFilter(corsSource);

    }
}
