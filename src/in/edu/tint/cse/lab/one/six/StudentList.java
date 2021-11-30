package in.edu.tint.cse.lab.one.six;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentList {
    class Std{
        String name;
        int roll;
        String course;
        int[] subMarks = new int[5];
    }
    ArrayList<Std> list = new ArrayList<>();
    void addStudent(String name, int roll, String course, int m1, int m2, int m3, int m4, int m5){
        Std s = new Std();
        s.name = name;
        s.roll = roll;
        s.course = course;
        s.subMarks[0] = m1;
        s.subMarks[1] = m2;
        s.subMarks[2] = m3;
        s.subMarks[3] = m4;
        s.subMarks[4] = m5;
        list.add(s);
    }
    void delStudent(int stdId){
        list.remove(stdId);
    }
    void displayAll(){
        int i = 0;
        for (Std s :
                list) {
            System.out.println("Std Id: "+i);
            System.out.println("Name: "+s.name);
            System.out.println("Roll: "+s.roll);
            System.out.println("Course: "+s.course);
            System.out.println("Marks: "+ Arrays.toString(s.subMarks)+"\n");
            i += 1;
        }
    }
    void editName(int stdId, String name){
        list.get(stdId).name = name;
    }
    void editRoll(int stdId, int roll){
        list.get(stdId).roll = roll;
    }
    void editCourse(int stdId, String course){
        list.get(stdId).course = course;
    }
    void editSubMarks(int stdId, int subNo, int marks){
        list.get(stdId).subMarks[subNo] = marks;
    }
    void subWiseAvg(int subNo){
        int i = 0;
        int total = 0;
        for (Std s :
                list) {
            total += s.subMarks[subNo];
            i += 1;
        }
        int avg = total/i;
        System.out.println("Average Marks (Subject: "+subNo+") :"+avg);
    }
    void stdWiseAvg(int stdId){
        Std s = list.get(stdId);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += s.subMarks[i];
        }
        System.out.println("Average Marks of Student "+stdId+": "+(total/5));
    }
}
