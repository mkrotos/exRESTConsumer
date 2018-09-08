package com.krotos.Objects;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {

    private List<Student> studentList;

    public StudentsList(){
        studentList=new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
