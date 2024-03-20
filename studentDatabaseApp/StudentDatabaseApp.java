package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        //Ask how many students we want to add
        System.out.print("Enter how many students to enroll : ");
        Scanner in = new Scanner(System.in); //scanner object for input
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        Student stu1 = new Student();

        for(int n = 0; n < numOfStudents ; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.print(students[n].toString());
        }
        stu1.enroll();
        stu1.payTuition();
        System.out.print(stu1.toString());
        //Creat N number of students
    }
}
