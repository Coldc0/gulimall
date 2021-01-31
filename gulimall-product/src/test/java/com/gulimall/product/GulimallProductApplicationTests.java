package com.gulimall.product;

import com.gulimall.product.entity.BrandEntity;
import com.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米");
        brandService.save(brandEntity);
        System.out.println("Success");
    }

}
