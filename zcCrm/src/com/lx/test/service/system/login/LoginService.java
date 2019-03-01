package com.lx.test.service.system.login;

import java.util.Map;

import com.lx.test.entity.system.User;

public interface LoginService {

	public User loginCheck(Map map) throws Exception;
	
}
