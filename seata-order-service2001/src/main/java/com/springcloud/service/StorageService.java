package com.springcloud.service;

import com.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther wy
 * @create 2021/11/9 16:58
 */

@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease/")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}
