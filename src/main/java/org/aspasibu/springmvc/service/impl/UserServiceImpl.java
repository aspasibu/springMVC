package org.aspasibu.springmvc.service.impl;

import java.util.List;

import org.aspasibu.springmvc.entity.User;
import org.aspasibu.springmvc.repository.UserRepository;
import org.aspasibu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		User savedUser = userRepository.saveAndFlush(user);
		return savedUser;
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
