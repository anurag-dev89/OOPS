
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    // Calculate salary after raise
    double raiseSalary(double percent) {
        return salary + (salary * percent / 100);
    }

    // Display employee details
    void display() {
        System.out.println("Id: " + id + "\nName: " + name + "\nSalary: " + salary);
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);

        e.name = "Anurag"; 
        e.id = 1; 
        e.salary = 200000;
        e.display();

        System.out.print("Enter percentage to increment: ");
        int percent = sc.nextInt();
        System.out.println("Salary after increment: " + e.raiseSalary(percent));
        
        sc.close();
    }
}
