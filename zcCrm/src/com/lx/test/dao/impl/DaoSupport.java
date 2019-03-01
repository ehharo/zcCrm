package com.lx.test.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lx.test.dao.Dao;

@Repository("DaoSupport")
public class DaoSupport implements Dao {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate ;

	@Override
	public Object getOne(String statementName, Object obj) {
		return sqlSessionTemplate.selectOne(statementName, obj);
	}

	@Override
	public List<Object> getList(String statementName, Object obj) {
		return sqlSessionTemplate.selectList(statementName, obj);
	}

	@Override
	public int add(String statementName, Object obj) {
		return sqlSessionTemplate.insert(statementName, obj);
	}

	@Override
	public int del(String statementName, Object obj) {
		return sqlSessionTemplate.delete(statementName, obj);
	}

	@Override
	public int update(String statementName, Object obj) {
		return sqlSessionTemplate.update(statementName, obj);
	}

}
