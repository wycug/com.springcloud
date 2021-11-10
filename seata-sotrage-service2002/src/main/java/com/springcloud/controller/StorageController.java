package com.springcloud.controller;

import com.springcloud.domain.CommonResult;
import com.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/9 18:54
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("/storage/decrease/")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count){
        System.out.println("------------------------------"+productId);
        storageService.decrease(productId, count);
        return new CommonResult(200,"库存更新成功");
    }

}
