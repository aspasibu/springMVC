package org.aspasibu.springmvc.controller;

import java.util.List;

import org.aspasibu.springmvc.entity.Users;
import org.aspasibu.springmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class IndexController {

	@Autowired
	private UsersService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showIndex(Model model) {

		List<Users> users = userService.getUsers();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String showAddUserView() {
		return "addUser";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(Users user) {
		userService.addUser(user);
		return "redirect:/users/";
	}

}
