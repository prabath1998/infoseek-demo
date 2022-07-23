package com.giz.infoseekdemo.controller;

import com.giz.infoseekdemo.domain.Car;
import com.giz.infoseekdemo.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/car")
public class CarController {
	
	@Autowired
	public CarService carService;
	
	@PostMapping
	public Car createCar(@RequestBody Car car) {
		return carService.createCar(car);
	}

}
