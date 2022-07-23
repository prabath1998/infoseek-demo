package com.giz.infoseekdemo.controller;

import com.giz.infoseekdemo.domain.Model;
import com.giz.infoseekdemo.service.ModelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/model")
public class ModelController {
	
	@Autowired
	public ModelService modelService;
	
	@PostMapping
	public Model createModel(@RequestBody Model model) {
		return modelService.createModel(model);
	}

}
