package com.anisha.day7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@PropertySource(value = "connection.yml", factory = YamlPropertyLoaderFactory.class)
@Component("databaseConnection")
public class DatabaseConnection {
    @Value("${db.username}")
    private String dbusername;

    @Value("${db.password}")
    private String dbpassword;

    public void loadConnectionProperties() {
        log.info("username:{}", dbusername);
        log.info("password:{}", dbpassword);
    }
}