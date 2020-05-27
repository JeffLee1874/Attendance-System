package com.example.atSys.service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.atSys.entity.EmpInfo;
import com.example.atSys.utils.Result;
import io.swagger.annotations.ApiParam;

public interface MangageService {
    //添加员工信息
    public Result<Object> addEmp(EmpInfo emp);

    // 搜索员工信息
    public Result<List<EmpInfo>> queryDeptEmpInfo(String searchValue, int page);

    //删除员工信息
    public Result<Object> delEmpInfo(String empId);

    // 更新员工信息
    public Result<Object> upEmpInfo(EmpInfo emp);



    //登陆校验
    public Result<Object> login(String username,String pass);

    //查询审批人
    public Result<List<EmpInfo>> queryApprovalInfo(int page,int limit);

    //搜索员工总数
    public Result<Object> queryCount(String searchValue);

    //修改密码
    public Result<Object> updatePass(String oriPass,String newPass);

    // 获取初始化员工信息总数
    public Result<Object> getInitInfoCount();

    //初始化员工信息记录
    public Result<List<EmpInfo>> getInitInfo(int page);

    //密码重置
    public Result<Object> passwordReset(String empId);

    //根据id获取需要更改员工信息
    public Result<EmpInfo> getEmpInfoById( String empId);
}
