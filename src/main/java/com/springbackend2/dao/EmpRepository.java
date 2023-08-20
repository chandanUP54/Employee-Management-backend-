package com.springbackend2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbackend2.controller.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}