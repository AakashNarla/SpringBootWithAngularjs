package com.sample.demo.rrcompare.business;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.rrcompare.dto.UserDto;
import com.sample.demo.rrcompare.repository.UserRepository;
import com.sample.demo.rrcompare.service.UserService;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto getUserById(Integer userId) {
		return userRepository.getUserById(userId);
	}

	@Override
	public void saveUser(UserDto userDto) {
		userRepository.saveUser(userDto);
	}

	@Override
	public Collection<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.getAllUsers();
	}

	
}
