package com.bycsmys.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculateService {

    Integer sum(Integer... values);
}
