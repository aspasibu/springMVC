package org.aspasibu.springmvc.repository;

import org.aspasibu.springmvc.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
