package com.jwt.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private Object userName;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		if (userName.equals("Durgesh")) {
			return new User("Durgesh", "Durgesh123", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found !!");
		}
	}

}
