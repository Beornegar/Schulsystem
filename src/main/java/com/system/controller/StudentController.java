package com.system.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.entities.Student;
import com.system.ressourceAssembler.StudentResourceAssembler;
import com.system.services.StudentService;

@RestController 
@RequestMapping(path = "/api/students") 
public class StudentController {

	@Autowired
	private StudentService service;

	@Autowired
	private StudentResourceAssembler assembler;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Resource<Student> getStudent(@PathVariable long id) {

		Student student = service.findById(id);

		return assembler.toResource(student);
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public Resources<Resource<Student>> getAllStudents() {

		List<Resource<Student>> students = StreamSupport.stream(service.findAll().spliterator(), false)
				.map(assembler::toResource).collect(Collectors.toList());

		return new Resources<>(students,
				linkTo(methodOn(StudentController.class).getAllStudents()).withSelfRel());
	}
}