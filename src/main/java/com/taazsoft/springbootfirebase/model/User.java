package com.taazsoft.springbootfirebase.model;

import java.io.Serializable;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;

import lombok.Data;

@Data
@FirebaseDocument("/user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@FirebaseId
	private String userId;
	private String userName;
	private String userEmail;
	private String userMobile;
}
