package com.example.controleouhiiii;

import com.example.controleouhiiii.dao.entities.Car;
import com.example.controleouhiiii.dao.repositories.CarRepository;
import com.example.controleouhiiii.dto.CarDTO;
import com.example.controleouhiiii.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleouhiiiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleouhiiiiApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CarRepository carRepository) {
		return args -> {
			List<Car> users = List.of(
					Car.builder().model("clio").color("red").matricul("6546g6re4").price(20000).build(),
					Car.builder().model("dacia").color("pink").matricul("54fe8rew").price(898900).build(),
					Car.builder().model("renault").color("jaun").matricul("wer648e4").price(565000).build(),
					Car.builder().model("audi").color("mauve").matricul("we6r48e4").price(123000).build()
			);

			carRepository.saveAll(users);
		};
	}
}
