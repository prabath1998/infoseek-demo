package com.giz.infoseekdemo.service;

import com.giz.infoseekdemo.domain.Car;
import com.giz.infoseekdemo.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	@Autowired
	public CarRepository carRepository;

	public Car createCar(Car car) {
		return carRepository.save(car);
	}
	

}
