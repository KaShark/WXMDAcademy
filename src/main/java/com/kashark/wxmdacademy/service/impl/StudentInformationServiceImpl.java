package com.kashark.wxmdacademy.service.impl;

import com.kashark.wxmdacademy.mapper.StudentInformationMapper;
import com.kashark.wxmdacademy.entity.StudentInformation;
import com.kashark.wxmdacademy.service.StudentInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生信息服务的实现
 * @author 赵宇鹏
 * @version 1.0
 */
@Service
@Slf4j
public class StudentInformationServiceImpl implements StudentInformationService {
    private final StudentInformationMapper studentInformationMapper;

    public StudentInformationServiceImpl(StudentInformationMapper studentInformationMapper) {
        this.studentInformationMapper = studentInformationMapper;
    }

    @Override
    public List<StudentInformation> getStudentInformation(Integer current, Integer size) {
        log.info("获取学生信息：当前页面 {}，页面尺寸 {}", current, size);
        return studentInformationMapper.getStudentInformation((current - 1) * size, size);
    }
}
