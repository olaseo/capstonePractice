package me.olaseo.capstoneProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class capstoneProject {
    public static void main(String[] args) {
        SpringApplication.run(capstoneProject.class, args);
    }
}