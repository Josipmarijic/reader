package com.company;

import java.util.ArrayList;
import java.util.List;

public class Recordcatalouge {
    public Recordcatalouge(String schoolName) {
        this.students = new ArrayList<>();
        this.schoolName = schoolName;
    }

    public List<Student> students;
    private String schoolName;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }


}
