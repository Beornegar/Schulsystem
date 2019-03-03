package com.system.ressourceAssembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import com.system.controller.UserController;
import com.system.entities.User;

@Component
public class UserResourceAssembler implements ResourceAssembler<User, Resource<User>> {

	@Override
	public Resource<User> toResource(User user) {
		
		return new Resource<>(user,
			linkTo(methodOn(UserController.class).getUser(user.getId())).withSelfRel(),
			linkTo(methodOn(UserController.class).getAllUsers()).withRel("users"));
	}

}