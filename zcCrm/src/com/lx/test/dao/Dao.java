package com.lx.test.dao;

import java.util.List;

public interface Dao {
	
	/**
	 * 查询1条信息
	 */
	public Object getOne(String statementName , Object obj);
	
	/**
	 * 查询多条信息 
	 */
	public List<Object> getList(String statementName , Object obj);
	
	/**
	 * 插入一条信息
	 */
	public int add(String statementName , Object obj);
	
	/**
	 * 删除
	 */
	public int del(String statementName , Object obj);
	
	/**
	 * 更新
	 */
	public int update(String statementName , Object obj);
}
