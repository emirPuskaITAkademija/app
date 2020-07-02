package com.itakademija.app.service;

import com.itakademija.app.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
