package in.edu.tint.cse.lab.two.three;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String dept;
        int bonus;
        int salary;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n = scan.nextInt();
        Manager[] managers = new Manager[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            name = scan.next();
            System.out.print("Department: ");
            dept = scan.next();
            System.out.print("Bonus: ");
            bonus = scan.nextInt();
            System.out.print("Salary: ");
            salary = scan.nextInt();
            managers[i] = new Manager(name,dept,bonus,salary);
        }
        scan.close();
        for (int i = 0; i < n; i++) {
            System.out.println(managers[i].display());
        }
    }
}
