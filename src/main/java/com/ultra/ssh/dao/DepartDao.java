package com.ultra.ssh.dao;

import java.util.List;

import com.ultra.ssh.bean.Depart;

public interface DepartDao {

	public List<Depart> getAll();

	public Depart get();

	public void update();

	public void delete();
}
