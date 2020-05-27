package com.example.atSys.service;

import java.util.List;
import java.util.Map;

import com.example.atSys.entity.Resource;
import com.example.atSys.utils.Result;

public interface ResourceService {
	
	// 加载用户资源
	public List<Resource> loadUserResources(Map<String, Object> map);

	// 加载全部资源
	public List<Resource> queryAll();
}
