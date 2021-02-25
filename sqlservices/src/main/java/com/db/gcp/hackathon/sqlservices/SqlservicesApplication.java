package com.db.gcp.hackathon.sqlservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SqlservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlservicesApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Testing Cloud SQL connection";
	}

}
