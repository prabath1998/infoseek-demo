package com.giz.infoseekdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.giz.infoseekdemo.domain.Bank;
import com.giz.infoseekdemo.repository.BankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepository;
	
	
	public Bank createBank(Bank bank) {
		return bankRepository.save(bank);
	}

	public List<Bank> getAllBanks() {		
		return bankRepository.findAll();
	}

	public Optional<Bank> getBankById(long bankId) {		
		return bankRepository.findById(bankId);
	}

	public Bank updateBank(long bankId, Bank bank) {
		Bank existingBank = bankRepository.getById(bankId);
		if (existingBank != null) {
			existingBank.setName(bank.getName());
			existingBank.setCode(bank.getCode());
			existingBank.setIncorporateDate(bank.getIncorporateDate());
			existingBank.setNoOfBranches(bank.getNoOfBranches());
			existingBank.setNoOfStaff(bank.getNoOfStaff());
			existingBank.setStatus(bank.getStatus());
		}
		return bankRepository.save(existingBank);
	}

	public void deleteBank(long bankId) {
		bankRepository.deleteById(bankId);
	}

	public List<Bank> getBanksByStatus(String status) {		
		return bankRepository.findByStatus(status);
	}

	public List<Bank> getBanksByAnnualProfit(double profit) {	
		return bankRepository.findByAnnualProfitGreaterThan(profit);
	}

}
