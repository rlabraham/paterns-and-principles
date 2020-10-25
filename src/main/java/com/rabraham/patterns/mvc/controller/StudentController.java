package com.rabraham.patterns.mvc.controller;

import com.rabraham.patterns.mvc.model.Student;
import com.rabraham.patterns.mvc.view.StudentView;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class StudentController {
    @NonNull
    private Student model;

    @NonNull
    private StudentView view;

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
