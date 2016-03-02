package org.aspasibu.springmvc.security;

import java.util.ArrayList;
import java.util.Collection;

import org.aspasibu.springmvc.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUser implements UserDetails {

	private static final long serialVersionUID = 1L;

	private User user;

	public SecurityUser(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();

		SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
		authorities.add(authority);

		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	public User getUser() {
		return user;
	}

}
