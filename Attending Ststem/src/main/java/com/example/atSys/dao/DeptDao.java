package com.example.atSys.dao;

import java.util.List;
import java.util.Map;

import com.example.atSys.entity.DeptInfo;

public interface DeptDao {
	
	//添加部门
	public int addDept(DeptInfo dept);

	//删除部门
	public int delDept(String id);

	//查询部门信息
	public List<DeptInfo> queryDept(Map<String,Object> map);

	//修改部门信息
	public int upDept(DeptInfo dept);
	
	//部门总数
	public int queryCount();
	
	//部门信息
	public List<DeptInfo> queryDeptInfo();
	
	public DeptInfo getDeptInfoById(String id);

}
