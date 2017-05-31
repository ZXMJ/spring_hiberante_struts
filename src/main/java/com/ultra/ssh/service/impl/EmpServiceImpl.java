package com.ultra.ssh.service.impl;

import java.util.List;

import com.ultra.ssh.bean.Emp;
import com.ultra.ssh.dao.EmpDao;
import com.ultra.ssh.service.EmpService;

public class EmpServiceImpl implements EmpService {

	private EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public List<Emp> getAll() {
		return empDao.getAll();
	}

	@Override
	public Emp get(Integer id) {
		return empDao.get(id);
	}

	@Override
	public void update(Emp emp) {
		empDao.update(emp);
	}

	@Override
	public void delete(Integer id) {
		empDao.delete(id);
	}

}
