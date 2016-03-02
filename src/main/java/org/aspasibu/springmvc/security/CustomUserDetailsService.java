package org.aspasibu.springmvc.security;

import org.aspasibu.springmvc.entity.User;
import org.aspasibu.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getUserByName(username);
		if (user == null) {
			throw new UsernameNotFoundException("UserName " + username + " not found");
		}

		return new SecurityUser(user);
	}

}
