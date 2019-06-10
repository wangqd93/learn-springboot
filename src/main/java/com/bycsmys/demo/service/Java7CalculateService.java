package com.bycsmys.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {

        int sum = 0;
        for (Integer i : values) {
            sum += i;
        }
        return sum;
    }
}
