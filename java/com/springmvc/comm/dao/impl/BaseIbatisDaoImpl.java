package com.springmvc.comm.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.springmvc.comm.dao.BaseIbatisDao;

@Repository
public class BaseIbatisDaoImpl extends SqlMapClientDaoSupport implements BaseIbatisDao{

	@Resource(name = "sqlMapClient")
	public void setSuperSqlMapClient(SqlMapClient sqlMapClient) {
		super.setSqlMapClient(sqlMapClient);
	}

	@Override
	public Object insert(String sqlId) {
		return this.getSqlMapClientTemplate().insert(sqlId);
	}

	@Override
	public Object insert(String sqlId, Object param) {
		return this.getSqlMapClientTemplate().insert(sqlId, param);
	}

}
