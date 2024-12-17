package com.example.controleouhiiii.web;

import com.example.controleouhiiii.dto.CarDTO;
import com.example.controleouhiiii.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {

    private CarService carService;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car) {
        return carService.saveCar(car);
    }



    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }


}
