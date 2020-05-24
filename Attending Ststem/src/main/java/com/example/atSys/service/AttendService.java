package com.example.atSys.service;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.example.atSys.entity.QueryRecord;
import com.example.atSys.entity.ResultProce;
import com.example.atSys.utils.Result;

public interface AttendService
{
	/**
	 * 查询公式统计表
	 * 
	 * @param 	qr		检索考勤记录信息
	 * @return
	 */
	public Result<List<ResultProce>> statistic(QueryRecord qr);
	
	/**
	 * 导出工时统计
	 */
	public HSSFWorkbook download(QueryRecord qr) throws Exception;
}
