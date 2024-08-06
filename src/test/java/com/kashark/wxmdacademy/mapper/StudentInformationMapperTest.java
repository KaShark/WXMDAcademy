package com.kashark.wxmdacademy.mapper;

import com.kashark.wxmdacademy.WxmdAcademyApplication;
import com.kashark.wxmdacademy.entity.StudentInformation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

@SpringBootTest(classes = WxmdAcademyApplication.class)
public class StudentInformationMapperTest {
    @Autowired
    private StudentInformationMapper studentInformationMapper;

    @Test
    void newStudentInformation(){
        StudentInformation studentInformation = new StudentInformation();
        studentInformation.setIsFresh(true);
        studentInformation.setRegistrationTime(new Timestamp(System.currentTimeMillis()));
        studentInformation.setStudentName("赵宇鹏");
        studentInformation.setSchool("大同二中");
        studentInformation.setMajor(true);
        studentInformation.setParentName("赵志荣");
        studentInformation.setTelephone(13233176303L);
        studentInformation.setWechatName("猫树");
        studentInformation.setScore(554L);
        studentInformation.setIsReread(false);
        studentInformation.setComment("");

        if (studentInformationMapper.insert(studentInformation) <= 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    void getStudentInformation(){
        studentInformationMapper.getStudentInformation(1,50);
    }
}
