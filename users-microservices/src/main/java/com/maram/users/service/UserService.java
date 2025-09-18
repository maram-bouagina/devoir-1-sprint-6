package com.maram.users.service;

import java.util.List;


import com.maram.users.entities.Role;
import com.maram.users.entities.User;
import com.maram.users.register.RegistrationRequest;


public interface UserService { 
	 User saveUser(User user); 
	 User findUserByUsername (String username); 
	 Role addRole(Role role); 
	 User addRoleToUser(String username, String rolename); 
	 List<User> findAllUsers(); User registerUser(RegistrationRequest request);
	 void sendEmailUser(User newUser,String code);
	 public User validateToken(String code);
	} 