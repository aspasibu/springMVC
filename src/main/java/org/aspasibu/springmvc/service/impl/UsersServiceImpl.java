package org.aspasibu.springmvc.service.impl;

import java.util.List;

import org.aspasibu.springmvc.entity.Users;
import org.aspasibu.springmvc.repository.UsersRepository;
import org.aspasibu.springmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository userRepository;

	@Override
	public Users addUser(Users user) {
		Users savedUser = userRepository.saveAndFlush(user);
		return savedUser;
	}

	@Override
	public List<Users> getUsers() {
		return userRepository.findAll();
	}

}
