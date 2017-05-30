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
		generatePiglets();
	}

	private void generatePiglets() {
		Piglet piglet1 = new Piglet("Martina");
		Piglet piglet2 = new Piglet("Linus");
		Piglet piglet3 = new Piglet("Pontus");
		Piglet piglet4 = new Piglet("Jimmy");
		Piglet piglet5 = new Piglet("Rickard");
		Piglet piglet6 = new Piglet("Thomas");
		Piglet piglet7 = new Piglet("Sam");
		pigletRepository.save(piglet1);
		pigletRepository.save(piglet2);
		pigletRepository.save(piglet3);
		pigletRepository.save(piglet4);
		pigletRepository.save(piglet5);
		pigletRepository.save(piglet6);
		pigletRepository.save(piglet7);

	}
}
