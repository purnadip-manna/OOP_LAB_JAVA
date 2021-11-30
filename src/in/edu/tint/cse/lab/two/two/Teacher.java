package in.edu.tint.cse.lab.two.two;

public class Teacher extends Person{
    String sub;
    String dept;
    int salary;
    Teacher(String name, int age, String gender, String sub, String dept, int salary){
        super(name,age, gender);
        this.sub = sub;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nDepartment: "+dept+"\nSubject: "+sub+"\nSalary: "+salary;
    }
}
