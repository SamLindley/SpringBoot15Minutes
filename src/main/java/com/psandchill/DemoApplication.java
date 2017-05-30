package com.psandchill;

import com.psandchill.model.Piglet;
import com.psandchill.model.PigletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PigletRepository pigletRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... strings){
		Piglet piglet1 = new Piglet("Martina");
		pigletRepository.save(piglet1);
	}
}
