package Studentmanagement;

public class Main {
    public static void main(String[] args) {

        
        Student s1 = new Student();

        s1.name = "kumaranmadhurai";
        s1.rollNo = 101;
        s1.mark = 90;

       
        Student s2 = new Student();

        s2.name = "kumaran";
        s2.rollNo = 102;
        s2.mark = 95;

       
        System.out.println("Student 1 Details");
        s1.display();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.display();
    }
}
