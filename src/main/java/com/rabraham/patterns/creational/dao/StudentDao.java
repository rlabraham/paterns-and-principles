package com.rabraham.patterns.creational.dao;

import com.rabraham.patterns.creational.dao.impl.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
