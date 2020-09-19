package com.aaronmccormack.phoresttechtest;

import com.aaronmccormack.phoresttechtest.controller.ClientController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhorestTechtestApplication implements CommandLineRunner {

	@Autowired
	public ClientController clientController;

	public static final org.slf4j.Logger Logger = LoggerFactory.getLogger(PhorestTechtestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PhorestTechtestApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Logger.info("Calling service");
		Logger.info(clientController.getAllClients("", "2539988369509"));
	}
}
