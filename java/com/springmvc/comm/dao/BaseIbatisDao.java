package com.springmvc.comm.dao;

public interface BaseIbatisDao {

	Object insert(String sqlId);

	Object insert(String sqlId, Object param);
}
