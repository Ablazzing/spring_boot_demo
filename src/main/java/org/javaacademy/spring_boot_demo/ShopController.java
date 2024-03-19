package org.javaacademy.spring_boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    @GetMapping("/test")
    public String test() {
        return "Hello Damir!";
    }
}
