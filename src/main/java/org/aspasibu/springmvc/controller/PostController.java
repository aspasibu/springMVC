package org.aspasibu.springmvc.controller;

import org.aspasibu.springmvc.entity.User;
import org.aspasibu.springmvc.service.PostService;
import org.aspasibu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class PostController {

	@Autowired
	private PostService postService;

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String showPosts(String username, Model model) {

		User user = userService.getUserByName(username);

		model.addAttribute("posts", postService.getPostsByUser(user));

		return "posts";
	}
}
