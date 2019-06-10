package com.bycsmys.demo.bootstrap;


import com.bycsmys.demo.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


public class SystemPropertyConditionBootstrap {

    @Bean(value = "helloWorld")
    @ConditionalOnSystemProperty(name = "user.name",value = "wangqd")
    public String helloWorld(){
        return "hello world wangqd";
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SystemPropertyConditionBootstrap.class)
                .web(WebApplicationType.NONE).run();

        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println(helloWorld);

        context.close();
    }
}
