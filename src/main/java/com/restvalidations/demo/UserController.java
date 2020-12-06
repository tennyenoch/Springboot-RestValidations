package com.restvalidations.demo;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@PostMapping(produces="application/json")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user)
	{
		User newUser = new User();
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setEmailId(user.getEmailId());
		newUser.setEmployeeNo(user.getEmployeeNo());
		newUser.setPassword(user.getPassword());
		return new ResponseEntity<User>(newUser, HttpStatus.OK);
	}

}
