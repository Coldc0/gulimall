package com.gulimall.member;

import com.gulimall.member.entity.MemberLoginLogEntity;
import com.gulimall.member.service.MemberLoginLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    MemberLoginLogService memberLoginLogService;

    @Test
    void contextLoads() {
        MemberLoginLogEntity memberLoginLogEntity = new MemberLoginLogEntity();
        memberLoginLogEntity.setMemberId(111111L);
        memberLoginLogService.save(memberLoginLogEntity);
        System.out.println("success");
    }

}
