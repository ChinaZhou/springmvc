package com.springmvc.comm.dao;

public interface BaseIbatisDao {

	Object insert(String sqlId);

	Object insert(String sqlId, Object param);
	
	Object getList(String sqlId, Object param);
	
	Object getList(String sqlId);
	
	Object getOne(String sqlId, Object param);
	
	Object getOne(String sqlId);
}
