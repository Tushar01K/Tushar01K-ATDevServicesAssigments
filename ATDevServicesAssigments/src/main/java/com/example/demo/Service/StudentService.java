package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Bean.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo stdrepo;

	public Student save(Student std) {
		// TODO Auto-generated method stub
		return stdrepo.save(std);
	}

	public List<Student> findAll() {
		
		return stdrepo.findAll();
	}

	
	public Student updateStd(Student std) {
		return stdrepo.save(std);

	}

	public void deleteById(int rollNo) {
		// TODO Auto-generated method stub
		stdrepo.deleteById(rollNo);
	}

	


}
