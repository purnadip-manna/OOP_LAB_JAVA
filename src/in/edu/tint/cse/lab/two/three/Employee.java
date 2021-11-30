package in.edu.tint.cse.lab.two.three;

public class Employee {
    static int autoId = 1;
    private int id;
    private String name;
    private String department;
    private int salary;
    Employee(){}
    Employee(String name, String department, int salary){
        this.id = autoId;
        autoId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return salary;
    }
    public String display() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + "\'" +
                ", Salary=" + salary +
                '}';
    }
}
