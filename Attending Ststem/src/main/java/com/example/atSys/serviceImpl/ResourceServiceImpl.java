package com.example.atSys.serviceImpl;

import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.atSys.dao.ResourceDao;
import com.example.atSys.entity.Resource;
import com.example.atSys.service.ResourceService;
import com.example.atSys.utils.Result;
import io.swagger.annotations.ApiOperation;

@Service("ResourceService")
public class ResourceServiceImpl implements ResourceService {
	@Autowired
	private ResourceDao resourceDao;

	// 加载用户资源 
	public List<Resource> loadUserResources(Map<String, Object> map) {
		return resourceDao.loadUserResources(map);
	}

	//查询所有资源
	public List<Resource> queryAll() {
		return resourceDao.queryAll();
	}

}
