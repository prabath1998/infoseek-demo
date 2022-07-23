package com.giz.infoseekdemo.repository;

import com.giz.infoseekdemo.domain.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
