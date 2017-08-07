package com.liuzhuang.BootAdminServer;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class BootAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminServerApplication.class, args);
	}
}
