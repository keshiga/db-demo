package com.thinkconstructive.dbdemo;

import com.thinkconstructive.dbdemo.entity.storeInformation;
import com.thinkconstructive.dbdemo.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;
	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}
	@Override
public void run(String... args){

		storeInformation storeInformationRepository1 = new storeInformation("Amazon", "please fetch", "2562");

		storeInformationRepository.save(storeInformationRepository1);

		storeInformationRepository.findBybookName("Amazon").forEach(val ->System.out.println(val));
	}
}
