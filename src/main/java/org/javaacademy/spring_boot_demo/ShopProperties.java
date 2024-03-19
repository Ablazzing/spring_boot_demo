package org.javaacademy.spring_boot_demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "shop")
@Getter
@Setter
@ToString
public class ShopProperties {
    private String name;
    private String address;
    private String[] items;
}
