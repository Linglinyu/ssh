package com.lly.best.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lly.best.dao.UserDao;
import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;
import com.lly.best.service.UserService;

/**
 * 类描述: 
 * 修改人: 程文席
 * 修改时间: 2015-12-12 12:00
 * 修改备注: 
 * @version V1.0
 */

@Service ("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userdao;

	@Override
	public User findUser(LoginForm loginForm) {
		return userdao.findUser(loginForm);
	}

}
