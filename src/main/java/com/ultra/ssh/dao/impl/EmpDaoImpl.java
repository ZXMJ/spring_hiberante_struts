package com.ultra.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ultra.ssh.bean.Emp;
import com.ultra.ssh.dao.BaseDao;
import com.ultra.ssh.dao.EmpDao;

public class EmpDaoImpl extends BaseDao implements EmpDao {

	@Override
	public List<Emp> getAll() {
		String hql = "FROM Emp";
		return getSessionFactory().getCurrentSession().createQuery(hql).list();
	}

	@Override
	public Emp get(Integer id) {
		String hql = "FROM Emp e WHERE e.id = ?";
		return (Emp) getSession().createQuery(hql).setParameter(0, id).uniqueResult();
	}

	@Override
	public void update(Emp emp) {
		String hql = "UPDATE Emp e SET e.name = ?,e.birth = ?, e.depart.id = ? WHERE e.id = ?";
		getSession().createQuery(hql).setParameter(0, emp.getName()).setParameter(1, emp.getBirth())
				.setParameter(2, emp.getDepart().getId()).setParameter(3, emp.getId()).executeUpdate();
	}

	@Override
	public void delete(Integer id) {
		String hql = "DELETE FROM Emp e where e.id = ?";
		getSession().createQuery(hql).setParameter(0, id).executeUpdate();
	}

}
