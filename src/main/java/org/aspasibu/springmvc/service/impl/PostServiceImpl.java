package org.aspasibu.springmvc.service.impl;

import java.util.List;

import org.aspasibu.springmvc.entity.Post;
import org.aspasibu.springmvc.entity.User;
import org.aspasibu.springmvc.repository.PostRepository;
import org.aspasibu.springmvc.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public Post addPost(Post post) {
		return postRepository.saveAndFlush(post);
	}

	@Override
	public void editPost(Post post) {
		postRepository.saveAndFlush(post);
	}

	@Override
	public void deletePost(Long id) {
		postRepository.delete(id);
	}

	@Override
	public List<Post> getPostsByUser(User user) {
		return postRepository.getPostsByUser(user);
	}

	@Override
	public Post getPostById(Long id) {
		return postRepository.getPostsById(id);
	}

}
