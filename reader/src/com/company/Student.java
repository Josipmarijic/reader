package com.company;

import com.company.RecordBook;

public class Student {
    public Student(String name) {
        this.name = name;

    }

    public Student(String name, RecordBook grades) {
        this.name = name;
        this.grades = grades;
    }

    private String name;
    private RecordBook grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordBook getGrades() {
        return grades;
    }

    public void setGrades(RecordBook grades) {
        this.grades = grades;
    }
}
