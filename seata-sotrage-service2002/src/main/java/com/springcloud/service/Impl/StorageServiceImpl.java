package com.springcloud.service.Impl;

import com.springcloud.dao.StorageDao;
import com.springcloud.domain.CommonResult;
import com.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/9 18:43
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}
