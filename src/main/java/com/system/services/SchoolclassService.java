package com.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.entities.Schoolclass;
import com.system.repositories.SchoolclassRepository;
import com.system.util.EntityNotFoundException;

@Service
public class SchoolclassService {

	@Autowired
	private SchoolclassRepository repository;

	public Schoolclass findById(long id) {

		return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Schoolclass not found with ID:" + id));
	}

	public Schoolclass save(Schoolclass user) {

		return repository.save(user);
	}

	public Iterable<Schoolclass> findAll() {

		return repository.findAll();
	}

	public void deleteById(long id) {

		repository.deleteById(id);

	}

}
