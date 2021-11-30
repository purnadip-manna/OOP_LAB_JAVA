package in.edu.tint.cse.lab.two.two;

public class Student extends Person{
    int roll;
    String stream;
    String course;
    Student(String name, int age, String gender, int roll, String stream, String course){
        super(name,age, gender);
        this.roll = roll;
        this.stream = stream;
        this.course = course;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nCourse: "+course+"\nStream: "+stream+"\nRoll: "+roll;
    }
}
