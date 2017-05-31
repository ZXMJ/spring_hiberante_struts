package com.ultra.ssh.dao.impl;

import java.util.List;

import com.ultra.ssh.bean.Depart;
import com.ultra.ssh.dao.BaseDao;
import com.ultra.ssh.dao.DepartDao;

public class DepartDaoImpl extends BaseDao implements DepartDao {

	@Override
	public List<Depart> getAll() {
		String hql = "FROM Depart";
		return getSession().createQuery(hql).list();
	}

	@Override
	public Depart get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
