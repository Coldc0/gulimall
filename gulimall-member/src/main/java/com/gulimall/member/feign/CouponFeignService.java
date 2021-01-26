package com.gulimall.member.feign;

import com.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 远程调用步骤：
 * 1. 引入open-feign
 * 2. 编写一个接口,声明接口的每一个方法都是调用哪个远程服务的请求
 * 3. 主类开启远程调用功能
 */
@FeignClient("gulimall-coupon") //调用哪个微服务
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")   //目标方法的访问路径
    public R memberCoupons();
}
