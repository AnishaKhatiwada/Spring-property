package com.anisha.day7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Starter implements CommandLineRunner {
    @Autowired
    private Hospital hospital;
    @Autowired
    private ReadUserFile readUserFile;
    @Autowired
    @Qualifier("databaseConnection")
    private DatabaseConnection databaseConnection;

    @Value("${app.name}")
    private String appName;


    @Override
    public void run(String... args) throws Exception {
        this.loadApplicationProperties();
        readUserFile.loadUserdetailsProperties();
        databaseConnection.loadConnectionProperties();
        this.loadHospitalProperties();
    }

    private void loadApplicationProperties() {
        log.info("Application.properties");
        log.info("App name:{}", appName);
    }

    private void loadHospitalProperties() {
        log.info("Hospital name:{}", hospital.getName());
        log.info("Hospital address:{}", hospital.getAddress());
    }
}
