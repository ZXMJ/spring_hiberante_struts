package com.ultra.ssh.service;

import java.util.List;

import com.ultra.ssh.bean.Emp;

public interface EmpService {

	public List<Emp> getAll();

	public Emp get(Integer id);

	public void update(Emp emp);

	public void delete(Integer id);
}
