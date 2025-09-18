package com.maram.users.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.maram.users.entities.User;
import com.maram.users.register.RegistrationRequest;
import com.maram.users.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
	@Autowired
	UserService userService;

	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}
	
	@PostMapping("/register")
	public User Register( @RequestBody RegistrationRequest  request ) {
		
		return userService.registerUser(request);
	}
	 @GetMapping("/verifyEmail/{token}") 
	    public User verifyEmail(@PathVariable("token") String token){    
	  return userService.validateToken(token); 
	    } 
}