package org.aspasibu.springmvc.controller;

import java.util.Date;

import org.aspasibu.springmvc.entity.Post;
import org.aspasibu.springmvc.security.SecurityUser;
import org.aspasibu.springmvc.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String showIndex(Model model) {
		model.addAttribute("posts", postService.getAllPosts());
		return "posts";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String addPost(Post post, @AuthenticationPrincipal UserDetails authUser) {

		if (authUser instanceof SecurityUser) {
			post.setUser(((SecurityUser) authUser).getUser());
			post.setDate(new Date());
			postService.addPost(post);
		}

		return "redirect:/post";
	}

}
