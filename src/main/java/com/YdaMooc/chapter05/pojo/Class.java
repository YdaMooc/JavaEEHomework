package com.YdaMooc.chapter05.pojo;

import java.util.List;

public class Class {
    private int id;
    private String classname;
    private List<Students> studentList;

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<Students> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Students> studentList) {
        this.studentList = studentList;
    }
}
