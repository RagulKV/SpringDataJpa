package com.ragul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ragul")
@EntityScan("com.ragul")
public class Jpahandson2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpahandson2Application.class, args);
	}

}
