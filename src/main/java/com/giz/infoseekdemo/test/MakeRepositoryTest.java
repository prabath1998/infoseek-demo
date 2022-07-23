package com.giz.infoseekdemo.test;

import java.util.List;

import com.giz.infoseekdemo.domain.Make;
import com.giz.infoseekdemo.repository.MakeRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MakeRepositoryTest {
	
	@Autowired
	private MakeRepository makeRepository;
	
	@Test
	public void createMake() {
		Make make = Make.builder()
				.make("test")
				.status("Active")
				.build();
		
		makeRepository.save(make);
	}
	
	@Test
	public void getAllMakes() {
		List<Make> makes = makeRepository.findAll();
		for(Make make : makes) {
			System.out.println(make);
		}
	}

}
