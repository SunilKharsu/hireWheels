package org.ncu.hireWheels.Controller;

import org.ncu.hireWheels.Services.UserService;
import org.ncu.hireWheels.entities.Role;
import org.ncu.hireWheels.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hirewheels/v1")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/addUser")
	public String createUser(@RequestBody User user) {
//		Role role = new Role("user");
//		User user = new User("Sunil", "Kharsu", "sunil@123", "951800", 500.0);
//		 
		String mssgString = userService.createUser(user);
		return mssgString;
	}
	
}
