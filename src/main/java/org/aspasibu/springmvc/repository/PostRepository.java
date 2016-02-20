package org.aspasibu.springmvc.repository;

import java.util.List;

import org.aspasibu.springmvc.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUserUsername(String username);

	Post findByDate(Date date);
}
