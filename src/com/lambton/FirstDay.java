package com.lambton;

import java.util.Arrays;

public class FirstDay
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java Programming");

        //Variable declaration
        int a, b, c;

        //Value Assignment
        a = 10;
        b = 20;

        c = a + b;

        //Display Result
        System.out.println("SUM : " + c);

        int x = Integer.MAX_VALUE;
        System.out.println("X : " + x);

        int y = x + 1;
        System.out.println("Y : " + y);
        System.out.println("Min : " + Integer.MIN_VALUE);



        Student s1 = new Student();
        s1.setValues();
        s1.display();

        Student s2 = new Student();
        s2.studentID = 2;
        s2.studentName = "Name 2";
        s2.display();

        Student s3 = new Student();
        s3.studentID = 3;
        s3.studentName = "Name 3";
        s3.display();



    }
}
