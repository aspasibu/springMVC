package org.aspasibu.springmvc.controller;

import java.util.List;

import org.aspasibu.springmvc.entity.User;
import org.aspasibu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String showIndex(String user, Model model) {

		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showAddUserView() {
		return "addUser";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(User user) {
		userService.addUser(user);
		return "redirect:/users/";
	}

}
