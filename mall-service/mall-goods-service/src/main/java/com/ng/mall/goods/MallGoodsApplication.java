package com.ng.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: WuYingBin
 * date: 2021/12/13
 */
@SpringBootApplication(scanBasePackages = {"com.ng.mall.goods", "com.ng.mall.config"})
@MapperScan(basePackages = {"com.ng.mall.goods.mapper"})
public class MallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class, args);
    }
}
