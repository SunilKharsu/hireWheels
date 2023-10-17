package org.ncu.hireWheels.Services;

import org.ncu.hireWheels.Repository.UserRepository;
import org.ncu.hireWheels.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public String createUser(User user) { 
		User user2 = userRepository.save(user);
		if(user2!=null) {
			return "User Added";
		}
		return "Error";
		
//		userRepository.findAll();
	}

	 
	
}
