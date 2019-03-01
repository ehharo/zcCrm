package com.lx.test.service.system.user;

import java.util.List;
import java.util.Map;

import com.lx.test.entity.system.User;

public interface UserService {

	/**
	 * 初始化页面 
	 * 条件查询
	 * @return
	 */
	public List<User> getUserList(Map map) ;
	
	/**
	 * 添加新用户
	 * @param map
	 * @return
	 */
	public boolean addUser(Map map) ;
	
	/**
	 * 删除用户
	 * @param map
	 * @return
	 */
	public boolean delUser(Map map) ;
	
	/**
	 * 修改用户
	 * @param map
	 * @return
	 */
	public boolean updateUser(Map map) ;
}
