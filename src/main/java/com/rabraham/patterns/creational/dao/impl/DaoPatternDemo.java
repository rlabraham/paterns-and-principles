package com.rabraham.patterns.creational.dao.impl;

import com.rabraham.patterns.creational.dao.StudentDao;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.getAllStudents().forEach(student -> log.info("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]"));

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        log.info("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
