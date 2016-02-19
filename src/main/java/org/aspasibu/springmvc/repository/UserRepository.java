package org.aspasibu.springmvc.repository;

import org.aspasibu.springmvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.username = :username")
	User getUserByName(@Param("username") String username);

}
