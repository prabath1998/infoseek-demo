package com.giz.infoseekdemo.repository;

import com.giz.infoseekdemo.domain.Make;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends JpaRepository<Make, Long>{

}
