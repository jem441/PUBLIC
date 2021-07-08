package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.models.User;

public class UserDaoMock implements UserDao {

	private List<User> users = new ArrayList<User>();
	
	public UserDaoMock() {
	users.add(new User("J", "M", "jm1"));
	users.add(new User("B", "S", "bs1"));
	
	}
	
	public User getUserByUserName(String username) {
		for(int i=0; i<users.size(); i++) {
			User u = users.get(i);
			if(u.getUsername().equals(username)) {
				return u;
			}
		}
		return null;
	}
	
	public User addUser(User u) {
		users.add(u);
		return u;
	}
}
