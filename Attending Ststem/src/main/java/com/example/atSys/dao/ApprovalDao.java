package com.example.atSys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.example.atSys.entity.LeaveTable;

public interface ApprovalDao {
	
	//请假信息
	public int leaveApplication(LeaveTable leave);
	
	//总数
	public int queryCount(Map<String,Object> map);
	
	//待审批参数
	public List<LeaveTable> getPendingApproval(Map<String,Object>map);

	//已审批总数
	public int queryApprovalCount(@Param(value = "applicant")String applicant);
	
	//根据搜索条件查询总数(已审批)
	public int querySearchApprovalCount(Map<String,Object> map);
	
	// 获取已审批记录
	public List<LeaveTable> getApproval(Map<String,Object> map);
	
	//根据搜索条件查询审批记录
	public List<LeaveTable> getSearchApproval(Map<String,Object> map);
	
	//审批操作
	public int operation(Map<String,Object> map);
	
	// 删除待审批记录
	public int delApproval(String id);
}
