package com.example.atSys.service;

import java.util.List;

import com.example.atSys.entity.DeptInfo;
import com.example.atSys.utils.Result;

public interface DeptService {
	
	// 添加部门
	public Result<Object> addDept(DeptInfo dept);

	// 删除部门
	public Result<Object> delDept(String id);

	//查询部门信息
	public Result<List<DeptInfo>> queryDept(int page);

	//修改部门信息
	public Result<Object> upDept(DeptInfo dept);
	
	//部门总数
	public Result<Object> queryCount();
	
	//部门信息
	public Result<List<DeptInfo>> queryDeptInfo();
	
	//获取需要修改的部门信息
	public Result<DeptInfo> getDeptInfoById(String id);
}
