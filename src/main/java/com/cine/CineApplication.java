package com.cine;

import com.cine.LoaderData.DataLoader;
import com.cine.consoleview.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineApplication  implements  CommandLineRunner {

	@Autowired
	MainMenu mainMenu;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(CineApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		dataLoader.run();
		mainMenu.mainMenu();
	}
}
