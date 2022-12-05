package com.learning.feign.soufan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableWebMvc
@EnableSwagger2
public class SoufanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoufanApplication.class, args);
	}

}
