package com.ultra.ssh.service.impl;

import java.util.List;

import com.ultra.ssh.bean.Depart;
import com.ultra.ssh.dao.DepartDao;

public class DepartServiceImpl implements DepartDao {

	private DepartDao departDao;

	public void setDepartDao(DepartDao departDao) {
		this.departDao = departDao;
	}

	@Override
	public List<Depart> getAll() {
		return departDao.getAll();
	}

	@Override
	public Depart get() {
		return null;
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

}
