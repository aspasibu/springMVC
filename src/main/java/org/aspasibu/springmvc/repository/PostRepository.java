package org.aspasibu.springmvc.repository;

import java.util.List;

import org.aspasibu.springmvc.entity.Post;
import org.aspasibu.springmvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<Post, Long> {

	@Query("select p from Post p where p.user = :user")
	List<Post> getPostsByUser(@Param("user") User user);

	@Query("select p from Post p where p.id = :id")
	Post getPostsById(@Param("id") Long id);
}
