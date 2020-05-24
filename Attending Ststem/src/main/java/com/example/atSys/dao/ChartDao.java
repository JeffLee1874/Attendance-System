package com.example.atSys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.atSys.entity.ChartData;

public interface ChartDao {
	public List<ChartData> getChartData(@Param(value = "empName") String empName,@Param(value = "year") String year);
}
