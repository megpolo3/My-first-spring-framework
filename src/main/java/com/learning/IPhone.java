package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class IPhone {

    public MobileProcessor getMobileProcessor() {
        return mobileProcessor;
    }

    public void setMobileProcessor(MobileProcessor mobileProcessor) {
        this.mobileProcessor = mobileProcessor;
    }

    @Autowired
    //use @Primary or Quailifer
    //@Qualifier("snapDragon")
    private
    MobileProcessor mobileProcessor;

    public void qualityConfig(){
        System.out.println("Use FaceTime !");
        mobileProcessor.process();
    }
}
