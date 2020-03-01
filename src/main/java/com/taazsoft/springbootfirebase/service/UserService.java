package com.taazsoft.springbootfirebase.service;

import java.util.List;

import com.taazsoft.springbootfirebase.UserDto;
import com.taazsoft.springbootfirebase.model.User;

public interface UserService {

	public String createUser(UserDto userDto);

	public String updateUser(String userId, UserDto userDto);

	public User getUser(String userId);
	
	public String deleteUser(String userId);
	
	public List<User> getAllUser();
}
