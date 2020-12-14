package com.learning;

import org.springframework.stereotype.Component;

@Component
public class FirstBeanRun implements MainInterface{

    public void testBean(){
        System.out.print("Need to see bean\n");
    }

}
