package org.aspasibu.springmvc.rest;

import java.util.List;

import org.aspasibu.springmvc.entity.Post;
import org.aspasibu.springmvc.service.PostService;
import org.aspasibu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "posts")
public class PostController {

	@Autowired
	private PostService postService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{username}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Post> getPosts(@PathVariable String username) {
		return postService.getPostsByUserName(username);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Post> getPosts() {
		return postService.getAllPosts();
	}
}
