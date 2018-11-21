package com.sample.demo.rrcompare.repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sample.demo.rrcompare.dto.UserDto;


@Repository
public class UserRepository {
	private static Map<Integer, UserDto> userDetails;
	
	static {
		userDetails =new HashMap<Integer, UserDto>(){
			{
				put(1, new UserDto(1,"Aakash"));
				put(2, new UserDto(2,"Sandeep"));
				put(3, new UserDto(3,"Rahul"));
				put(4, new UserDto(4,"Singh"));
				
			}
		};
	}
	
	public Collection<UserDto> getAllUsers(){
		return this.userDetails.values();
	}

	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return this.userDetails.get(userId);
	}

	public void saveUser(UserDto userDto) {
		// TODO Auto-generated method stub
		userDetails.put(userDto.getUserId(), userDto);
	}
}
