package com.ultra.ssh.dao;

import java.util.List;

import com.ultra.ssh.bean.Emp;

public interface EmpDao {

	public List<Emp> getAll();

	public Emp get(Integer id);

	public void update(Emp emp);

	public void delete(Integer id);
}
