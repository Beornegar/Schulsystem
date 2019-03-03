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

import com.system.entities.Schoolclass;
import com.system.ressourceAssembler.SchoolclassResourceAssembler;
import com.system.services.SchoolclassService;

@RestController 
@RequestMapping(path = "/api/classes") 
public class SchoolclassController {

	@Autowired
	private SchoolclassService service;

	@Autowired
	private SchoolclassResourceAssembler assembler;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Resource<Schoolclass> getSchoolclass(@PathVariable long id) {

		Schoolclass sclass = service.findById(id);

		return assembler.toResource(sclass);

	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public Resources<Resource<Schoolclass>> getAllSchoolclass() {

		List<Resource<Schoolclass>> sclasses = StreamSupport.stream(service.findAll().spliterator(), false)
				.map(assembler::toResource).collect(Collectors.toList());

		return new Resources<>(sclasses,
				linkTo(methodOn(SchoolclassController.class).getAllSchoolclass()).withSelfRel());
	}

}
