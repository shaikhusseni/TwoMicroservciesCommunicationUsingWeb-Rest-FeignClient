package com.restemp.userservice.services;

import com.restemp.userservice.dto.ResponseDto;
import com.restemp.userservice.entities.User;

public interface UserService {

	
	
	 User saveUser(User user);

	    ResponseDto getUser(Long userId);
}


