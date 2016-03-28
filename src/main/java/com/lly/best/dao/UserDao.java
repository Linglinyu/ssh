package com.lly.best.dao;

import org.springframework.stereotype.Repository;

import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;

/**
 * 类描述: userDao
 * 修改人: 程文席
 * 修改时间: 2016-03-28 12:00
 * 修改备注: 
 * @version V1.0
 */
@Repository
public class UserDao {
	public User findUser(LoginForm loginForm){
		User user = new User();
		return user;
	}
}
