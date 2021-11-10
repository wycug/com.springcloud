package com.springcloud.service;

import com.springcloud.domain.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther wy
 * @create 2021/11/9 18:42
 */

public interface StorageService {

    void decrease(Long productId, Integer count);
}
