package com.learning;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("Bestet CPU");
    }
}
