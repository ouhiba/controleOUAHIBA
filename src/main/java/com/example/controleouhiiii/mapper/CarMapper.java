package com.example.controleouhiiii.mapper;


import com.example.controleouhiiii.dao.entities.Car;
import com.example.controleouhiiii.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDTO avionDto){
        return mapper.map(avionDto, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car){
        return mapper.map(car, CarDTO.class);
    }



}
