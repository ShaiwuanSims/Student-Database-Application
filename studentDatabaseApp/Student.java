package studentDatabaseApp;
import java.util.Objects;
import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId; //belongs to the student object. what we want to set.
    private String courses = "";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private String[] enrolled ={};
    private String status;

    private static int id = 1000; // belongs to the class

    //constructor - prompt name and year
    public Student(){
        Scanner in = new Scanner(System.in); //create scanner object for input
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student's grade year : ");
        this.gradeYear = in.nextLine();

        setStudentID();
        //increment student each time one is created.
    }

    //Method to set id
    private void setStudentID(){
        //Grade level + id
        id++;
        this.studentId = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit):  ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }
    //Method to display status

    //Method to view balance/paytuition
    public void viewBalance(){
        System.out.println("YOUR BALANCE IS :  $" + tuitionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.print("ENTER PAYMENT AMOUNT : $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of :  $" + payment);
        viewBalance();
    }
    public String toString(){
        return "NAME : "+firstName + " " + lastName +
                "\nGRADE LEVEL : "+ gradeYear +
                "\nSTUDENT ID : "+ studentId +
                "\nCOURSES ENROLLED : " + courses +
                "\nBALANCE IS  : $" + tuitionBalance;
    }
}
