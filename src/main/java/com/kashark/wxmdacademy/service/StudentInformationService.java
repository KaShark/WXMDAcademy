package com.kashark.wxmdacademy.service;

import com.kashark.wxmdacademy.entity.StudentInformation;

import java.util.List;

/**
 * 学生信息服务
 * @author 赵宇鹏
 * @version 1.0
 */
public interface StudentInformationService {
    List<StudentInformation> getStudentInformation(Integer current, Integer size);
}
