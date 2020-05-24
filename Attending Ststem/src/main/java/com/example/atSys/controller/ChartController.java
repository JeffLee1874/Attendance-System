package com.example.atSys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.atSys.service.ChartService;
import com.example.atSys.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value="/chart")
@Api(value = "/chart", description = "图表数据相关接口")
@CrossOrigin
public class ChartController {

	@Autowired
	private ChartService chartService;
	
	@ApiOperation(value = "获取图表数据")
	@GetMapping(value="/getChartData.io")
	@ResponseBody
	public Result<Object> getChartData(){
		return chartService.getChartData();
	}
}
