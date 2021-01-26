package com.gulimall.order;

import com.gulimall.order.entity.RefundInfoEntity;
import com.gulimall.order.service.RefundInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    RefundInfoService refundInfoService;

    @Test
    void contextLoads() {
        RefundInfoEntity refundInfoEntity = new RefundInfoEntity();
        refundInfoEntity.setRefundSn("azge");
        refundInfoService.save(refundInfoEntity);
        System.out.println("success");
    }

}
