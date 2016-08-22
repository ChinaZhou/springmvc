package com.springmvc.comm.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.comm.dao.BaseMybatisDao;

@Repository
public class BaseMybatisDaoImpl implements BaseMybatisDao{

	/*@Resource(name = "sqlSessionTemplate")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}*/
	
	@Resource(name="sqlSession")
	private SqlSessionTemplate sqlSession;

	@Override
	public Object insert(String sqlId) {
		return sqlSession.insert(sqlId);
	}

	@Override
	public Object insert(String sqlId, Object param) {
		return sqlSession.insert(sqlId, param);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getList(String sqlId, Object param) {
		return sqlSession.selectList(sqlId, param);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getList(String sqlId) {
		return sqlSession.selectList(sqlId);
	}

	@Override
	public Object getOne(String sqlId, Object param) {
		return sqlSession.selectOne(sqlId, param);
	}

	@Override
	public Object getOne(String sqlId) {
		return sqlSession.selectOne(sqlId);
	}

	@Override
	public Object delete(String sqlId, Object param) {
		return sqlSession.delete(sqlId, param);
	}

	@Override
	public Object update(String sqlId, Object param) {
		return sqlSession.update(sqlId, param);
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
}
