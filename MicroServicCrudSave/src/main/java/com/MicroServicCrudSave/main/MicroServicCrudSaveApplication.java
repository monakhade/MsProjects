package com.MicroServicCrudSave.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MicroServicCrudSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicCrudSaveApplication.class, args);
	}

}
