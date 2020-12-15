package com.learning;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragonOther implements MobileProcessor {


    @Override
    public void process() {
        System.out.println("Use Autowired primary qualifier");
    }
}
