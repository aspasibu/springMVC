package org.aspasibu.springmvc.controller;

import org.aspasibu.springmvc.entity.Users;
import org.aspasibu.springmvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class IndexController {

	@Autowired
	private UsersService userService;

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String showIndex(@PathVariable String username, Model model) {
		Users user = new Users();
		user.setId((long) 1);
		user.setUsername("aspasibu");
		user.setEmail("andrei.spasibukhov@t-systems.com");
		user.setFirstName("Andrei");
		user.setLastName("Spasibukhov");
		user.setPassword("1234");
		userService.addUser(user);
		model.addAttribute("name", username);
		return "hello";
	}

}
