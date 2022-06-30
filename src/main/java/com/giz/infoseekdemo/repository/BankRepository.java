package com.giz.infoseekdemo.repository;

import java.util.List;

import com.giz.infoseekdemo.domain.Bank;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long>{
	
List<Bank> findByStatus(String status);

List<Bank> findByAnnualProfitGreaterThan(double profit);

}
