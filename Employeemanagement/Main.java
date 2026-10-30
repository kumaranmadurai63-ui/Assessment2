package Employeemanagement;

public class Main {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.name = "kumaran";
        d.id = 101;
        d.salary = 50000;
        d.programmingLanguage = "Java";

        System.out.println("Developer Details");
        d.display();
    }
}