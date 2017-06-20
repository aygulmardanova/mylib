package ru.kpfu.mylib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kpfu.mylib.config.DatabaseConfig;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {Application.class, DatabaseConfig.class}, args);
	}
}
