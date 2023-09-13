package Classes_Objects.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student st = new Student();

        System.out.println("Enter the roll_no of the student : ");
        st.rollNo = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the name of the student : ");
        st.name = scan.nextLine();

        System.out.println("Enter the course of the student : ");
        st.course = scan.nextLine();

        System.out.println("Enter the marks m1 :");
        st.m1 = scan.nextDouble();
        
        System.out.println("Enter the marks m2 :");
        st.m2 = scan.nextDouble();
        
        System.out.println("Enter the marks m3 :");
        st.m3 = scan.nextDouble();

        System.out.println("The total marks for the student with rollno " + st.rollNo + "is :" + st.total());
        System.out.println("The average marks for the student with rollno " + st.rollNo + " is :" + st.average());
        System.out.println("The grade marks for the student with rollno " + st.rollNo + "is :" + st.grade());
        System.out.println("The details of the student is :" + st.showDetails());
        
        scan.close();
    }
    
}
