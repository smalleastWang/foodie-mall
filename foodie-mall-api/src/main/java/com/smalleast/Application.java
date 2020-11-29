package com.smalleast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast
 * @Description : TODO
 * @Date 11/14/20 6:32 下午
 **/

@SpringBootApplication()
@MapperScan(basePackages = "com.smalleast.mapper")
// 扫描所有包和相关组件包 org.n3r.idworker.Sid (不能写启动类所在包会导致配置无效)
@ComponentScan(basePackages = {"com.smalleast", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}