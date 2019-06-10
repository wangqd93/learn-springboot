package com.bycsmys.demo.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by wangq on 2017/12/7.
 */
public class Config implements HealthIndicator {

    @Override
    public Health health() {
//       return Health.down().;
        return Health.up().build();
    }
}
