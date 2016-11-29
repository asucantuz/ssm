package com.szkingdom.ssm.service.impl;

import com.szkingdom.ssm.service.RedisTestService;

/**
 * Created by tianf on 2016/8/2.
 */
public class RedisTestServiceImpl implements RedisTestService {

    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }
}
