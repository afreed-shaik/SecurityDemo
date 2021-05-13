package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ojas.dao.UserRepository;
import com.ojas.domain.User;

@Service
public class MyUserDetailsService {
	@Autowired
	private UserRepository repo;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("User 404");
		return new UserPrincipal(user);
	}
}
