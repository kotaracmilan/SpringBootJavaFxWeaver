package com.kota;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javafx.application.Application;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.spring.SpringFxWeaver;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)

public class SpringJavaFxApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Application.launch(JavaFxApplication.class, args);
	}
	
	@Bean
    public FxWeaver fxWeaver(ConfigurableApplicationContext applicationContext) {
        // Would also work with javafx-weaver-core only:
        // return new FxWeaver(applicationContext::getBean, applicationContext::close);
        return new SpringFxWeaver(applicationContext); 
	}

}
