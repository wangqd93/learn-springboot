package com.bycsmys.demo.config;


import com.bycsmys.demo.annotation.EnableHelloWorld;
import com.bycsmys.demo.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionalOnSystemProperty(name = "user.name",value = "wangqd")
public class HelloWorldAutoConfiguration {


}
