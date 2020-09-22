package com.example.springbootstudy;

import me.example.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyBeanRunner implements ApplicationRunner {

    @Autowired
    MyBean myBean;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        myBean.setName("taesik");
        myBean.setHowLong(100);
        System.out.println(myBean);
    }
}
