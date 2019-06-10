package com.bycsmys.demo.bootstrap;


import com.bycsmys.demo.service.CalculateService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.bycsmys.demo.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .profiles("java7")
                .run(args);



        CalculateService bean = context.getBean(CalculateService.class);
        System.out.println("sum:"+ bean.sum(1,2,3,4,5,6,7,8,9,10));

        context.close();
    }
}
