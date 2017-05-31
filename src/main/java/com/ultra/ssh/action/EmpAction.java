package com.ultra.ssh.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.ultra.ssh.bean.Emp;
import com.ultra.ssh.service.EmpService;

public class EmpAction implements RequestAware {

	private EmpService empService;
	private Map<String, Object> request;

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	public String list() {
		List<Emp> emps = empService.getAll();
		request.put("emps", emps);
		return "list";
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
