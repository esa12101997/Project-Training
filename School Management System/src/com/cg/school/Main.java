package com.cg.school;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher sayani = new Teacher(1,"Sayani",500);
        Teacher lisa = new Teacher(2,"Lisa",700);
        Teacher varat = new Teacher(3,"Varat",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(sayani);
        teacherList.add(lisa);
        teacherList.add(varat);


        Student tanmay = new Student(1,"Tanmay",4);
        Student rakesh = new Student(2,"Rakesh Dey",12);
        Student rishi = new Student(3,"Rishi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tanmay);
        studentList.add(rishi);
        studentList.add(rakesh);




        School ghs = new School(teacherList,studentList);

        Teacher chegan = new Teacher(6,"Chegan", 900);

        ghs.addTeacher(chegan);


        tanmay.payFees(5000);
        rakesh.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("Making SCHOOL PAY SALARY");
        sayani.receiveSalary(sayani.getSalary());
        System.out.println("GHS has spent for salary to " + sayani.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        varat.receiveSalary(varat.getSalary());
        System.out.println("GHS has spent for salary to " + varat.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakesh);

        lisa.receiveSalary(lisa.getSalary());

        System.out.println(lisa);


    }
}