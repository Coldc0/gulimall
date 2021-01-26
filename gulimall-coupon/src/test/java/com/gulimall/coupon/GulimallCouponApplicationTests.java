package com.gulimall.coupon;

import com.gulimall.coupon.entity.SpuBoundsEntity;
import com.gulimall.coupon.service.SpuBoundsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    SpuBoundsService spuBoundsService;

    @Test
    void contextLoads() {
        SpuBoundsEntity spuBoundsEntity = new SpuBoundsEntity();
        spuBoundsEntity.setSpuId(1001L);
        spuBoundsService.save(spuBoundsEntity);
        System.out.println("success");
    }

}
