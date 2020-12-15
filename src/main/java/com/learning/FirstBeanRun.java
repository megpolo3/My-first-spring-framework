package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Non Qualified and decaptilized
public class FirstBeanRun implements MainInterface{

    public Bags getBags() {
        return bags;
    }

    public void setBags(Bags bags) {
        this.bags = bags;
    }

    @Autowired
    private Bags bags;

    public void testBean(){
        System.out.print("Need to see bean\n");
    }

    /*annotation bean to xml bean*/
    public void callBagBean(){
        System.out.print("Calling xml base bag bean "+ bags.happyBean());
    }

}
