package org.aspasibu.springmvc.service;

import java.util.List;

import org.aspasibu.springmvc.entity.Post;
import org.aspasibu.springmvc.entity.User;

public interface PostService {
	public Post addPost(Post post);

	public void editPost(Post post);

	public void deletePost(Long id);

	public List<Post> getPostsByUser(User user);

	public Post getPostById(Long id);
}
