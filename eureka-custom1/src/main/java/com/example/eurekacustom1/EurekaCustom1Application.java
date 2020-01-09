package com.example.eurekacustom1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class EurekaCustom1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCustom1Application.class, args);
	}

}
