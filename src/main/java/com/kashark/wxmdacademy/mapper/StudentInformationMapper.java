package com.kashark.wxmdacademy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kashark.wxmdacademy.entity.StudentInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 学生信息Mapper
 * @author 赵宇鹏
 * @version 1.0
 */
@Mapper
public interface StudentInformationMapper extends BaseMapper<StudentInformation> {
    List<StudentInformation> getStudentInformation(Integer start, Integer length);

    List<StudentInformation> getStudentInformationInAscRegistrationTime(Integer start, Integer length);

    List<StudentInformation> getStudentInformationInDescRegistrationTime(Integer start, Integer length);

    List<StudentInformation> getStudentInformationInAscScore(Integer start, Integer length);

    List<StudentInformation> getStudentInformationInDescScore(Integer start, Integer length);

    StudentInformation getStudentInformationById(Long id);

    StudentInformation getStudentInformationByStudentId(Long studentId);

    List<StudentInformation> searchStudentInformation(String[] keywords, Integer start, Integer length);
}
