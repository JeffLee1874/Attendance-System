package com.example.atSys.dao;

import java.util.List;

import com.example.atSys.entity.DataProceTable;
import com.example.atSys.entity.QueryRecord;

public interface AttendDao {

	/**
	 * 查询部门的工时统计表
	 * 
	 * @param qr			检索信息
	 * @return
	 */
	public List<DataProceTable> searchDeptProce(QueryRecord qr);

	/**
	 * 查询个人的工时统计表
	 * 
	 * @param qr			检索信息
	 * @return
	 */
	public List<DataProceTable> searchProce(QueryRecord qr);
}
