package com.learning.feign.soufan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SoufanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoufanApplication.class, args);
	}

}
