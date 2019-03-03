package com.system.ressourceAssembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import com.system.controller.SchoolclassController;
import com.system.entities.Schoolclass;



@Component
public class SchoolclassResourceAssembler implements ResourceAssembler<Schoolclass, Resource<Schoolclass>> {

	@Override
	public Resource<Schoolclass> toResource(Schoolclass sclass) {
		
		return new Resource<>(sclass,
			linkTo(methodOn(SchoolclassController.class).getSchoolclass(sclass.getId())).withSelfRel(),
			linkTo(methodOn(SchoolclassController.class).getAllSchoolclass()).withRel("schoolclasses"));
	}

}