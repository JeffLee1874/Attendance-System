package com.example.atSys.dao;

import java.util.List;
import java.util.Map;

import com.example.atSys.entity.Resource;

public interface ResourceDao {
	
	//加载用户资源
	public List<Resource> loadUserResources(Map<String, Object> map);

	//获取所有资源
	public List<Resource> queryAll();

	//获取资源id
	public List<Integer> queryId(String userId);

	//获取资源名称
	public List<String> queryResourceName(String userId);
}
