package com.jspiders.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springboot.pojo.StudentPOJO;
import com.jspiders.springboot.response.StudentResponse;
import com.jspiders.springboot.service.StudentService;

//@CrossOrigin
//@RestController


@Controller
@RequestMapping(value = "/springboot")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	ResponseEntity<StudentResponse> add(@RequestBody StudentPOJO student){
		StudentPOJO pojo=service.add(student);
		if (pojo!=null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse(
					"OK", "Student added successfully..!!",pojo,null), HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse(
				"FAIL", "Student data not found..!!",null,null),HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/search{id}")
	ResponseEntity<StudentResponse>search(@PathVariable int id){
		StudentPOJO pojo=service.search(id);
		if (pojo!=null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse(
					"OK", "Student data found", pojo, null), HttpStatus.FOUND);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse(
				"FAIL", "Data not found", null,null), HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("searchAll")
	ResponseEntity<StudentResponse>searchAll(){
		List<StudentPOJO> pojos=service.searchAll();
		if (pojos!=null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse(
					"OK", "Students data found", null,pojos),HttpStatus.FOUND);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse(
				"FAIL", "Students data not found", null,null),HttpStatus.BAD_REQUEST);
		
	}
	@PostMapping("update")
	ResponseEntity<StudentResponse>update(@RequestBody StudentPOJO student){
		StudentPOJO pojo=service.update(student);
		if (pojo!=null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse(
					"OK", "Student Updated Successfully", pojo, null), HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse(
				"FAIL", "Data not found", null,null), HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/delete{id}")
	ResponseEntity<StudentResponse>delete(@PathVariable int id){
		service.delete(id);
			return new ResponseEntity<StudentResponse>(new StudentResponse(
					"OK", "Students data deleted successfully..!!", null,null),HttpStatus.ACCEPTED);
	}
	
}
