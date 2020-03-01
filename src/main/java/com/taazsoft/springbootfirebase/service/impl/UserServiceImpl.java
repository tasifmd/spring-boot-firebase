package com.taazsoft.springbootfirebase.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taazsoft.springbootfirebase.UserDto;
import com.taazsoft.springbootfirebase.model.User;
import com.taazsoft.springbootfirebase.repository.UserRepository;
import com.taazsoft.springbootfirebase.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public String createUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		userRepository.push(user,user.getUserId());
		return "Saved";
	}

	@Override
	public String updateUser(String userId, UserDto userDto) {
		User user = userRepository.get(userId);
		user.setUserEmail(userDto.getUserEmail());
		user.setUserMobile(userDto.getUserMobile());
		user.setUserName(userDto.getUserName());
		userRepository.update(user, userId);
		return "Updated";
	}

	@Override
	public User getUser(String userId) {
		User user = userRepository.get(userId);
		return user;
	}

	@Override
	public String deleteUser(String userId) {
		userRepository.remove(userId);
		return "Deleted";
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User getUserByName(String name) {
		Optional<User> user = userRepository.findByName(name);
		return user.get();
	}
	
	
}
