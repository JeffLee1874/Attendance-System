package com.example.atSys.dao;

import java.util.List;
import java.util.Map;

import com.example.atSys.entity.UserResoure;
import org.apache.ibatis.annotations.Param;

import com.example.atSys.entity.EmpInfo;
//import com.example.atSys.entity.UserResoure;

public interface AuthorityDao {
	
	//查询员工信息
	public List<EmpInfo> queryEmpInfo(Map<String, Object> map);
	
	//搜索员工（部门或个人）
	public List<EmpInfo> querySearchEmpInfo(Map<String,Object> map);

	//查询员工总数
	public int queryCount();

	// 搜索员工数(部门或个人)
	public int querySearchCount(@Param(value = "value") String value);

	//添加权限
	public int addAuthority(Map<String, Object> map);

	//删除权限
	public int delAuthority(Map<String, Object> map);
	
	//获取用户资源id
	public UserResoure getUserResoure(@Param(value = "userId") String userId, @Param(value = "resourceId") String resourceId);
}
