package org.spring.boot.samples.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("org.spring.boot.samples")
@EnableJpaRepositories("org.spring.boot.samples")
@SpringBootApplication(scanBasePackages = "org.spring.boot.samples")
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

}

