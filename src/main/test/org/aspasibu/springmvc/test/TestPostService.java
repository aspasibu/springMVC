package org.aspasibu.springmvc.test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.aspasibu.springmvc.entity.Post;
import org.aspasibu.springmvc.entity.User;
import org.aspasibu.springmvc.repository.PostRepository;
import org.aspasibu.springmvc.service.PostService;
import org.aspasibu.springmvc.service.impl.PostServiceImpl;
import org.easymock.EasyMock;
import org.springframework.test.util.ReflectionTestUtils;

import junit.framework.TestCase;

public class TestPostService extends TestCase {

	private PostRepository postRepository;
	private PostService postService;
	private User user;
	private Post post;
	private List<Post> listPost = new ArrayList<>();

	@Override
	protected void setUp() throws Exception {
		postRepository = EasyMock.createNiceMock(PostRepository.class);
		postService = new PostServiceImpl();
		ReflectionTestUtils.setField(postService, "postRepository", postRepository);

		post = new Post();
		post.setDate(new Date(0));
		post.setId((long) 1);
		post.setText("text");
		post.setUser(new User());
		post.setTitle("title");
		listPost.add(post);
	}

	public void testAddPost() {
		expect(postRepository.saveAndFlush(post)).andReturn(post);
		replay(postRepository);

		assertEquals("add driver ", postService.addPost(post), post);

		verify(postRepository);
	}

	public void testGetPostsByUser() {
		expect(postRepository.getPostsByUser(user)).andReturn(listPost);
		replay(postRepository);

		assertEquals("list of posts", postService.getPostsByUser(user), listPost);
		verify(postRepository);
	}

	public void testGetPostById() {
		expect(postRepository.getPostsById((long) 1)).andReturn(post);

		replay(postRepository);

		assertEquals("get post by id", postService.getPostById((long) 1), post);

		verify(postRepository);
	}

}
