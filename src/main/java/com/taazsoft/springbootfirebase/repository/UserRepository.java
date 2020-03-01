package com.taazsoft.springbootfirebase.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;
import com.taazsoft.springbootfirebase.model.User;

@Repository
public class UserRepository extends DefaultFirebaseRealtimeDatabaseRepository<User, String> {

	@Autowired
	private UserRepository userRepository;

	public Optional<User> findByName(String name) {
		List<User> users = userRepository.findAll();
		Optional<User> data = users.stream().filter(user -> name.equals(user.getUserName())).findAny();
		return data;
	}
}
