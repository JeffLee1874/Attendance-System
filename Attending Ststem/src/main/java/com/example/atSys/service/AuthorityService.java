package com.example.atSys.service;

import java.util.List;

import com.example.atSys.entity.EmpInfo;
import com.example.atSys.utils.Result;

public interface AuthorityService {

    //查询员工信息
    public Result<List<EmpInfo>> queryEmpInfo(Integer page,String value,Integer statue);

    //查询员工总数
    public Result<Object> queryCount(String value,Integer statue);

    //添加权限
    public Result<Object> addAuthority(Integer[] resourceId, String empId);

    // 查询权限
    public Result<List<Integer>> queryAuthorityId(String empId);

    //查询是否拥有该权限url
    public Result<Object> authorityUrl(String url);

}
