package com.springcloud.lb;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther wy
 * @create 2021/11/3 19:34
 */
public interface LoadBalance {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
