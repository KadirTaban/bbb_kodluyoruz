package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableFeignClients
@EnableJpaRepositories
@EnableJpaAuditing
public class SpringBootApplication {


        public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);

        }
}

