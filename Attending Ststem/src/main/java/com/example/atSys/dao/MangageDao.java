package com.example.atSys.dao;

import java.util.List;
import java.util.Map;

import com.example.atSys.entity.EmpInfo;

public interface MangageDao {

	//添加员工信息
	public int addEmp(EmpInfo emp);

	//搜索员工信息
	public List<EmpInfo> queryDeptEmpInfo(Map<String, Object> map);

	//删除员工信息
	public int delEmpInfo(Map<String, Object> map);

	//更新员工信息
	public int upEmpInfo(EmpInfo emp);

	public String queryDept(String empName);

	public List<Map<String, Object>> queryNum();

	public EmpInfo queryInfo(String name);

	public List<EmpInfo> queryApprovalInfo(Map<String,Object> map);

	public int queryEmpCount();

	public int queryCount(String searchValue);

	public List<EmpInfo> getInitInfo(Map<String,Object> map);

	public int getInitInfoCount();

	public int passwordReset(Map<String,Object> map);

	public EmpInfo getNum(String empId);

	public EmpInfo getEmpInfoById(String empId);
}
