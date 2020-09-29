package com.kota;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class SpringJavaFxApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Application.launch(JavaFxApplication.class, args);
	}

}
