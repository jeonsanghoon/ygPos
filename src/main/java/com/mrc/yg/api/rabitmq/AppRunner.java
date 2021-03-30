package com.mrc.yg.api.rabitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

//@Profile("!test")
//@Component
public class AppRunner implements CommandLineRunner {
    @Value("${config.app.duration:0}")
    private int duration;
    @Autowired
    private ConfigurableApplicationContext ctx;
    @Override
    public void run(String... arg0) throws Exception {
       // System.out.println("Ready ... running for " + duration + "ms");
       // Thread.sleep(duration);
       // ctx.close();
    }
}

