package com.example.atSys.service;

import com.example.atSys.utils.Result;

import java.util.List;

import com.example.atSys.entity.LeaveTable;
import com.example.atSys.utils.Result;

public interface ApprovalService {
    //请假申请
    public Result<Object> leaveApplication(String leaveType,String startTime, String endTime,int leaveNum, String leaveRegard, String approver);

    //待审批总数
    public Result<Object> queryCount(int approverStatue);

    //获取待审批记录
    public Result<List<LeaveTable>> getPendingApproval(int page,int approverStatue);

    //已审批总数
    public Result<Object> queryApprovalCount(String applicant,String createStartTime,String createEndTime,int approverStatue,int statue);

    //获取已审批记录
    public Result<List<LeaveTable>> getApproval(int page,String applicant,String createStartTime,String createEndTime,int approverStatue,int statue);

    //审批操作
    public Result<Object> operation(String id,int approverStatue);


    //删除待审批记录
    public Result<Object> delApproval(String id);
}

