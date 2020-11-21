package com.smalleast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast
 * @Description : TODO
 * @Date 11/14/20 6:32 下午
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.smalleast.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
