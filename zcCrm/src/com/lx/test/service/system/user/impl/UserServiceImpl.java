package com.lx.test.service.system.user.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lx.test.dao.Dao;
import com.lx.test.entity.system.User;
import com.lx.test.service.system.user.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="DaoSupport")
	private Dao dao ;
	
	@Override
	public List<User> getUserList(Map map) {
		return (List)dao.getList("userMapper.getUserList", map);
	}

	@Override
	public boolean addUser(Map map) {
		boolean flag = false ;
		if(dao.add("userMapper.addUser", map) > 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean delUser(Map map) {
		boolean flag = false ;
		if(dao.add("userMapper.delUser", map) > 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateUser(Map map) {
		return false;
	}

}
