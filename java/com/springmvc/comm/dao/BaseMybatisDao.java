package com.springmvc.comm.dao;

public interface BaseMybatisDao {

	Object insert(String sqlId);

	Object insert(String sqlId, Object param);
	
	Object getList(String sqlId, Object param);
	
	Object getList(String sqlId);
	
	Object getOne(String sqlId, Object param);
	
	Object getOne(String sqlId);
	
	Object delete(String sqlId, Object param);
	
	Object update(String sqlId, Object param);
}
