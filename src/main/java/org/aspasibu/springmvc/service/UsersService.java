package org.aspasibu.springmvc.service;

import java.util.List;

import org.aspasibu.springmvc.entity.Users;

public interface UsersService {

	Users addUser(Users user);

	List<Users> getUsers();

}
