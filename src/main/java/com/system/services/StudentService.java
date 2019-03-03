package com.system.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.entities.Student;
import com.system.repositories.StudentRepository;
import com.system.util.EntityNotFoundException;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student findById(long id) {

		return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Student not found with ID:" + id));
	}

	public Student save(Student user) {

		return repository.save(user);
	}

	public Iterable<Student> findAll() {

		return repository.findAll();
	}

	public void deleteById(long id) {

		repository.deleteById(id);

	}

}
