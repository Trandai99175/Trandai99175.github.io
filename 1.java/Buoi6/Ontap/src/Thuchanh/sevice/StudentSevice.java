package Thuchanh.sevice;

import Thuchanh.model.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentSevice {
    public Student createStudent() {
        Scanner sc= new Scanner (System.in);
        Random rd = new Random ();

        Student student = new Student ();
        student.id= rd.nextInt ( 100)+1;

        System.out.println ("Tên học viên:" );
        student.name = sc.nextLine ( );

        System.out.println ("Điểm lý thuyết:" );
        student.theoryPoint = sc.nextDouble ();

        System.out.println ("Điểm thực hành:" );
        student.practicePoint = sc.nextDouble ( );
        return student;

    }
    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        double point= (theoryPoint+practicePoint)/2;
        return point;
    }
    public void printInfo(Student s) {
        System.out.println ("id:"+s.id );
        System.out.println ("name:"+s.name);
        System.out.println ("điểm lý thuyết:"+ s.theoryPoint );
        System.out.println ("điểm thực hành:" +s.practicePoint );

    }


}
