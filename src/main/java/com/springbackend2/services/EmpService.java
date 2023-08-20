package com.springbackend2.services;

import java.util.List;

import com.springbackend2.controller.entity.Emp;



public interface EmpService {

	public Emp createEmp(Emp emp);

	public List<Emp> getAllEmp();

	public Emp getEmpById(int id);

	public void deleteEmp(int id);

	public Emp updateEmp(int id, Emp emp);

}