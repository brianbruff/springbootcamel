package net.bk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class SampleBean{

    @Autowired
    SampleChildBean child;

    @Value("${greeting}")
    private String say;

    public String saySomething() {
        return say;
    }

}