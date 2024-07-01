package Entities;

import java.util.Scanner;

public class Student {
    public String name;
    public double firstQuarterGrade;
    public double secondQuarterGrade;
    public double thirdQuarterGrade;

    Scanner scStudent = new Scanner(System.in);
    public double calculateTotalGrade () {
        return firstQuarterGrade + secondQuarterGrade + thirdQuarterGrade;

    }
    public void newStudent () {
        System.out.println("Enter the name of Student");
        name = scStudent.nextLine();
        System.out.println("Enter the grade for the first quarter: ");
        firstQuarterGrade = scStudent.nextDouble();
        System.out.println("Enter the grade for the second quarter: ");
        secondQuarterGrade = scStudent.nextDouble();
        System.out.println("Enter the grade for the third quarter: ");
        thirdQuarterGrade = scStudent.nextDouble();

    }

}
