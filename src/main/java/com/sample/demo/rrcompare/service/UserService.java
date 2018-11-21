package com.sample.demo.rrcompare.service;

import java.util.Collection;
import java.util.List;

import com.sample.demo.rrcompare.dto.UserDto;



public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    Collection<UserDto> getAllUsers();
}
