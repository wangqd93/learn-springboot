package com.bycsmys.demo.bootstrap;

import com.bycsmys.demo.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableHelloWorld
public class EnableHelloWorldBootstrap {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class).web(WebApplicationType.NONE).run(args);

        String helloWorld = context.getBean("helloWorld",String.class);
        System.out.println("helloWorld Bean:" + helloWorld);

        context.close();

    }
}
