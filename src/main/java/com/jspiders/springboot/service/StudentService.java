package com.jspiders.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.StudentPOJO;
import com.jspiders.springboot.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;;;

	public StudentPOJO add(StudentPOJO student) {
		StudentPOJO pojo=repository.save(student);
		return pojo;
	}

	public StudentPOJO search(int id) {
		StudentPOJO pojo=repository.findById(id).orElse(null);
		return pojo;
	}

	public List<StudentPOJO> searchAll() {
		List<StudentPOJO> pojos=repository.findAll();
		return pojos;
	}

//	public StudentPOJO delete(int id) {
//		StudentPOJO pojo= repository.deleteById(id);
//		return pojo;
//	}

	public StudentPOJO update(StudentPOJO student) {
		StudentPOJO pojo=repository.save(student);
		return pojo;
	}

	public void delete(int id) {
		repository.deleteById(id);
	}

	

}
