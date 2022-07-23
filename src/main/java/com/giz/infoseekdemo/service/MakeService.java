package com.giz.infoseekdemo.service;

import com.giz.infoseekdemo.domain.Make;
import com.giz.infoseekdemo.repository.MakeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MakeService {

	@Autowired
	public MakeRepository makeRepository;
	
	public Make createMake(Make make) {		
		return makeRepository.save(make);
	}

}
