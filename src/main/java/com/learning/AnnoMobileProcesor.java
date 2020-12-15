package com.learning;

import org.springframework.stereotype.Component;

@Component
public class AnnoMobileProcesor {

    public void usingComponentScan(){

        System.out.println("Configuration File -> ComponentScan -> @Component -> use bean");
    }
}
