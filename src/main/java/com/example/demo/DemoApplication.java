package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

    @Value("${hello}")
    String hello;

    @Value("${database}")
    String database;

    @Value("${awsaccesskey}")
    String awsaccesskey;

    @Value("${awssecretkey}")
    String awssecretkey;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        return String.format("""
                <p>Hello</p>
                <img src= https://www.thoughtco.com/thmb/CoviI4KgInS4AtTkNRtODkZD6BY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/GettyImages-937057490-401a1830296d458e98f62fdc7b6417d1.jpg>
                <img src= https://www.advantour.com/img/kyrgyzstan/culture/kyrgyzstan-culture.jpg>
                <p>%s ->(from code) hello</p>
                <p>%s ->(from code) database</p>
                <p>%s ->(from code) awsaccesskey</p>
                <p>%s ->(from code) awssecretkey</p>
                """, hello, database, awsaccesskey, awssecretkey);

    }

}
