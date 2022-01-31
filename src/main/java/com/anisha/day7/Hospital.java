package com.anisha.day7;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Setter
@Getter
@PropertySource(value = "classpath:hospital.properties")
@ConfigurationProperties(prefix = "hsptl")
@Configuration

public class Hospital {
    private String address;
    private String name;
}
