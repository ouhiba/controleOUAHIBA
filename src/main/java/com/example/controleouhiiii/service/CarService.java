package com.example.controleouhiiii.service;

import com.example.controleouhiiii.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDto);



    public List<CarDTO> getCArByModel(String model);

    List<CarDTO> getCarByModel(String model);


 // public List<CarDTO> saveCars(List<CArDTO> CarDtos);

}
