package com.example.controleouhiiii.service;

import com.example.controleouhiiii.dao.entities.Car;
import com.example.controleouhiiii.dao.repositories.CarRepository;
import com.example.controleouhiiii.dto.CarDTO;
import com.example.controleouhiiii.mapper.CarMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto);
        car = carRepository.save(car);
        carDto = carMapper.fromCarToCarDto(car);
        return carDto;

        // return carMapper.fromCarToCarDto(carRepository.save(carMapper.fromCarDtoToCar(carDto)));
    }



    @Override
    public List<CarDTO> getCArByModel(String model) {
        return List.of();
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }


}