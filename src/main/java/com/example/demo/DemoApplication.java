package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        return """
                <p>Hello</p>
                <img src= https://www.thoughtco.com/thmb/CoviI4KgInS4AtTkNRtODkZD6BY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-937057490-401a1830296d458e98f62fdc7b6417d1.jpg>
                """;

    }

}
