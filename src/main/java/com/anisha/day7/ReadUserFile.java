package com.anisha.day7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@PropertySource(value = "classpath:userdetails.properties")
@Component
public class ReadUserFile {
    @Value("${user.id}")
    private String userid;
    @Value("${user.password}")
    private String password;

      public void loadUserdetailsProperties() {
        log.info("id:{}", userid);
        log.info("password:{}", password);
    }
}
