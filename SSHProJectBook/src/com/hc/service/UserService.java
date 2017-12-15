package com.hc.service;

import com.hc.bean.User;

public interface UserService {

	User login(User user);

	User findById(Integer user_id);

	void updatePassword(User u);

}
