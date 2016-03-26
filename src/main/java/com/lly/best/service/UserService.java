package com.lly.best.service;

import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;

/**
 * 类描述: 
 * 修改人: 程文席
 * 修改时间: 2015-12-12 12:00
 * 修改备注: 
 * @version V1.0
 * @param <LoginForm>
 */
public interface UserService {
	
	public User findUser(LoginForm loginForm);
}
