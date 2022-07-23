package com.giz.infoseekdemo.repository;

import com.giz.infoseekdemo.domain.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{

}
