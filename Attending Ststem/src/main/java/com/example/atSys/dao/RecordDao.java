package com.example.atSys.dao;

import java.util.List;

import com.example.atSys.entity.EnterTable;
import com.example.atSys.entity.OutTable;
import com.example.atSys.entity.QueryRecord;
import com.example.atSys.entity.RecordTable;
import com.example.atSys.utils.Result;

public interface RecordDao {
	
	// 将上下班时间写入worktimetable
	public int workTable(List<RecordTable> list);

	//
	public int emptyNull();

	//查询迟到早退明细
	public List<RecordTable> queryDetailed(QueryRecord qr);

	//查询部门早退明细
	public List<RecordTable> queryDeptDetailed(QueryRecord qr);

	
	
	//插入迟到早退记录
	public int detailed(List<RecordTable> list);

	// 个人早退，迟到，加班
	public List<RecordTable> queryDetailedInfo(QueryRecord qr);
	
	
	//查询部门员工记录数
	public int queryDeptCount(QueryRecord qr);

	public int queryCount(QueryRecord qr);

	//个人分页的记录数
	public List<RecordTable> queryOtherPage(QueryRecord qr);

	// 部门分页的记录数
	public List<RecordTable> queryPage(QueryRecord qr);

}
