package com.example.Proje3;

import com.example.Proje3.Controllers.BotController;
import com.example.Proje3.Controllers.InitializationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Proje3Application {

	public static void main(String[] args) {
		SpringApplication.run(Proje3Application.class, args);
	}

	/*@Bean
	CommandLineRunner run(InitializationService initializationService, BotController botController) {
		return args -> {
			// Uygulama başlatıldığında müşterileri yalnızca bir kez oluştur
			initializationService.initializeCustomers();

			// Botları başlat
			botController.startBot();
		};
	}*/
}
