package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Student;

import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService stdservice;

	@PostMapping("save")
	public Student saveStd(@RequestBody Student std) {
		return stdservice.save(std);

	}

	@GetMapping("get")
	public List<Student> findAll() {
		return stdservice.findAll();

	}

	@PutMapping("update")
	public Student updateStd(@RequestBody Student std) {
		return stdservice.save(std);

	}

	@DeleteMapping("delete{rollNo}")
	public void deleteStd(@PathVariable int rollNo) {
		 stdservice.deleteById(rollNo);
	}

}
