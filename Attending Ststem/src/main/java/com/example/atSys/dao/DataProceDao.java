package com.example.atSys.dao;

import java.util.List;

import com.example.atSys.entity.DataProceTable;

public interface DataProceDao {
	
	//数据处理结果写入数据库工时统计表
	public int dataProce(List<DataProceTable> list);

	//清空数据处理表工时统计为0的记录
	public int emptyZero();

}
