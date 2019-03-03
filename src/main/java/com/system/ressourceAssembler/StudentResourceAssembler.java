package com.system.ressourceAssembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import com.system.controller.StudentController;
import com.system.entities.Student;

@Component
public class StudentResourceAssembler implements ResourceAssembler<Student, Resource<Student>> {

	@Override
	public Resource<Student> toResource(Student student) {

		return new Resource<>(student,
				linkTo(methodOn(StudentController.class).getStudent(student.getId())).withSelfRel(),
				linkTo(methodOn(StudentController.class).getAllStudents()).withRel("students"));
	}

}