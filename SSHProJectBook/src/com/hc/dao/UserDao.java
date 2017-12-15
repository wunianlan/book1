package com.hc.dao;

import com.hc.bean.User;

public interface UserDao{

	User login(User user);

	User findById(Integer user_id);

	void updatePassword(User u);

}
