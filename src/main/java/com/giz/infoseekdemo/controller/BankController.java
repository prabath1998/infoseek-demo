package com.giz.infoseekdemo.controller;

import java.util.List;
import java.util.Optional;

import com.giz.infoseekdemo.domain.Bank;
import com.giz.infoseekdemo.service.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/bank")
public class BankController {
	
	@Autowired
	public BankService bankService;

	@PostMapping
	public Bank createBank(@RequestBody Bank bank) {
		return bankService.createBank(bank);		
	}
	
	@PutMapping(path = "{bankId}")
	public Bank updateBank(@PathVariable long bankId,@RequestBody Bank bank) {
		return bankService.updateBank(bankId,bank);
		
	}
	
	@DeleteMapping(path = "{bankId}")
	public void deleteBank(@PathVariable long bankId) {
		bankService.deleteBank(bankId);
	}
	
	@GetMapping
	public List<Bank> getAllBankNames(){
		return bankService.getAllBanks();
		
	}
	
	@GetMapping(path = "{bankId}")
	public Optional<Bank> getBankByBankId(@PathVariable long bankId) {
		return bankService.getBankById(bankId);
		
	}
	
	@GetMapping(path = "/status")
	public List<Bank> getBanksByStatus(@RequestParam(value = "status") String status){
		return bankService.getBanksByStatus(status);
	}
	
	@GetMapping(path = "/profit")
	public List<Bank> getBanksByAnnualProfit(@RequestParam(value = "profit") double profit){
		return bankService.getBanksByAnnualProfit(profit);		
	}

}
