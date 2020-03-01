package com.taazsoft.springbootfirebase.repository;

import org.springframework.stereotype.Repository;

import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;
import com.taazsoft.springbootfirebase.model.User;

@Repository
public class UserRepository extends DefaultFirebaseRealtimeDatabaseRepository<User,String> {

}
