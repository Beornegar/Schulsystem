package com.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.entities.User;
import com.system.repositories.UserRepository;
import com.system.util.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User save(User user) {

		return repository.save(user);
	}

	public Iterable<User> findAll() {

		return repository.findAll();
	}

	public User findById(long id) {

		return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with ID:" + id));
	}

	public User replaceUser(User newUser, long id) {
		return repository.findById(id).map(user -> {

			user.setUsername(newUser.getUsername());
			user.setPassword(newUser.getPassword());
			user.setEmail(newUser.getEmail());
			return repository.save(user);
		}).orElseGet(() -> {
			newUser.setId(id);
			return repository.save(newUser);
		});

	}

	public void deleteById(long id) {
		
		repository.deleteById(id);
		
	}
}