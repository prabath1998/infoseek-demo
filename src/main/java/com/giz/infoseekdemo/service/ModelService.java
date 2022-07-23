package com.giz.infoseekdemo.service;

import com.giz.infoseekdemo.domain.Model;
import com.giz.infoseekdemo.repository.ModelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
	
	@Autowired
	public ModelRepository modelRepository;

	public Model createModel(Model model) {		
		return modelRepository.save(model);
	}

}
