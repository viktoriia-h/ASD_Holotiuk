package com.company;

import java.sql.Struct;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(3);
        tree.add(4);
        tree.add(8);
        tree.add(7);
        tree.add(5);
        tree.add(2);
        tree.add(9);

        tree.traversingTheTree();
        tree.delete(9);
        tree.traversingTheTree();
        tree.isContainAndAddIfNeed(6);
        tree.isContainAndAddIfNeed(9);
        tree.traversingTheTree();


        //task2
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Holotuik Viktoria ", 5,5,5,5));
        students.add(new Student("Petrenko Petro ", 4,4,4,4));
        students.add(new Student("Shumchuk Yana ", 3,3,3,3));
        students.add(new Student("Filatov Viktor ", 5,4,4,5));
        for (Student student: students)
        {
            student.sumScore(student);
        }
        for (Student s : students)
        {
            System.out.println("Before Sorting: "+ s.fio + "Summed score: " + s.summedScore );
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.summedScore < s2.summedScore)
                    return -1;
                else return 1;
            }
        });
        System.out.println("\n");
        for (Student s : students)
        {
            System.out.println("After Sorting: "+ s.fio + "Average score: " + s.summedScore );
        }
    }
    public static class Student
    {
        String fio;
        double math, biologic, physic, english;
        double summedScore;
        Student(String fio, double math, double biologic, double physic, double english)
        {
            this.fio = fio;
            this.math = math;
            this.biologic = biologic;
            this.physic = physic;
            this.english = english;
        };

        public void sumScore(Student s)
        {
            s.summedScore = s.math+s.biologic+physic+english;
        }

    }

}