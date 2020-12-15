package com.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.learning")
public class AnnotationConfig {

    @Bean
    public IPhone getPhone(){
        return new IPhone();
    }

    /*
    @Bean
    public MobileProcessor getCPU(){
        return new SnapDragon();
    }*/


}
