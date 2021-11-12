package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Recordcatalouge recordcatalouge = new Recordcatalouge("Grit");


        ReadFile(recordcatalouge);

        PrintInfo(recordcatalouge);


    }

    private static void PrintInfo(Recordcatalouge recordcatalouge) {
        for (var s: recordcatalouge.getStudents()
             ) {
            System.out.println("Student name is" + s.getName());
            for (var g: s.getGrades().getGrades()
                 ) {
                System.out.println("Student grades: " + g);
            }
        }
    }

    private static void ReadFile(Recordcatalouge recordcatalouge) throws FileNotFoundException {
        String file = "/Users/josipmarijic/IdeaProjects/reader/src/betyg1.txt";
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            var array = temp.split(":");

            var array1 = array[1].split(",");
            List<Integer> listGrades = new ArrayList<>();
            for (var g: array1){
                listGrades.add(Integer.parseInt(g.trim()));

            }
            recordcatalouge.students.add(new Student(array[0],new RecordBook(listGrades)));
         }
    }
}
