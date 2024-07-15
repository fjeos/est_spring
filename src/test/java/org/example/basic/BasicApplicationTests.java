package org.example.basic;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {

    // application.yml의 계층 구조
    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void printConfig() {
        System.out.println("포트번호: " + port);
        System.out.println("애플리케이션 이름: " + appName);
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }

}
