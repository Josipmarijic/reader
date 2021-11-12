package com.company;

import java.util.List;

public class RecordBook {
    public RecordBook(List<Integer> grades) {
        this.grades = grades;
    }

    private List<Integer> grades;

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

}
