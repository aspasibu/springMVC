package org.aspasibu.springmvc.service;

import java.util.List;

import org.aspasibu.springmvc.entity.User;

public interface UserService {

	User addUser(User user);

	List<User> getUsers();

}
