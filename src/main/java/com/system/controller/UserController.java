package com.system.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.entities.User;
import com.system.ressourceAssembler.UserResourceAssembler;
import com.system.services.UserService;

@RestController // This means that this class is a Controller
@RequestMapping(path = "/api/users") // This means URL's start with /demo (after Application path)
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private UserResourceAssembler assembler;

	@PostMapping(  consumes = {MediaType.APPLICATION_JSON_VALUE})
	ResponseEntity<?> newUser(@RequestBody User newUser) throws URISyntaxException {
		
		Resource<User> resource = assembler.toResource(service.save(newUser));

		return ResponseEntity
				.created(new URI(resource.getId().expand().getHref()))
				.body(resource);
	}

	@PutMapping("/{id}")
	ResponseEntity<?> replaceUser(@RequestBody User newUser, @PathVariable long id) throws URISyntaxException {

		Resource<User> resource = assembler.toResource(service.replaceUser(newUser, id));
		
		return ResponseEntity
				.created(new URI(resource.getId().expand().getHref()))
				.body(resource);
	}

	@GetMapping(path = "/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE})
	public Resource<User> getUser(@PathVariable long id) {

		User user = service.findById(id);

		return assembler.toResource(user);

	}

	@GetMapping( produces = {MediaType.APPLICATION_JSON_VALUE})
	public Resources<Resource<User>> getAllUsers() {

		List<Resource<User>> users =  StreamSupport.stream(service.findAll().spliterator(), false)
				.map(assembler::toResource)
				.collect(Collectors.toList());
		
		return new Resources<>(users,
				linkTo(methodOn(UserController.class).getAllUsers()).withSelfRel());
	}

	@DeleteMapping("/{id}")
	ResponseEntity<?> deleteEmployee(@PathVariable long id) {
		service.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}

}