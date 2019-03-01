package com.lx.test.service.system.login.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lx.test.dao.Dao;
import com.lx.test.entity.system.User;
import com.lx.test.service.system.login.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Resource(name="DaoSupport")
	private Dao dao ;
	
	@Override
	public User loginCheck(Map map) throws Exception {
		return (User)dao.getOne("loginMapper.checkUser", map);
	}

}
