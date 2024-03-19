package org.javaacademy.spring_boot_demo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Component
@Slf4j
public class Shop {
    @Value("${shop.name}")
    private String name;

    @Value("${shop.address}")
    private String address;

    @Value("${shop.items}")
    private String[] items;
    private String price;

    private ShopProperties shopProperties;

    public Shop(ShopProperties shopProperties, @Qualifier("price") String price) {
        this.shopProperties = shopProperties;
        this.price = price;
    }

    @PostConstruct
    public void init() {
        //shop.name=coca-cola
//        URL url = Shop.class.getClassLoader().getResource("application.properties");
//        try {
//            this.name = Files.readAllLines(Path.of(url.toURI()))
//                    .stream()
//                    .filter(line -> line.contains("shop.name"))
//                    .map(line -> line.split("=")[1])
//                    .findFirst()
//                    .orElse("");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        log.info("SHOP IS WORK! NAME {}\n address {}\nitems {}", this.name, this.address, this.items);
        log.info(shopProperties.toString());
        log.info("price {}", price);
    }
}
