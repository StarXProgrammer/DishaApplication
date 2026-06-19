package com.firebase.dishaapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class DishaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DishaApplication.class, args);
    }

}
