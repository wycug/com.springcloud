package com.springcloud.lb;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @auther wy
 * @create 2021/11/3 19:36
 */

@Component
public class MyLb implements LoadBalance{

    private AtomicReference<Integer> atomicReference = new AtomicReference<>(0);

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int serviceInstanceSize = serviceInstances.size();
        int nextIndex = getAndIncrement()%serviceInstanceSize;
        return serviceInstances.get(nextIndex);
    }
    public final int getAndIncrement(){
        int value;
        int next;
        do{
            value = atomicReference.get();
            next = value >= Integer.MAX_VALUE? 0 : value + 1;
        }while (!atomicReference.compareAndSet(value, next));
        return next;
    }
}
