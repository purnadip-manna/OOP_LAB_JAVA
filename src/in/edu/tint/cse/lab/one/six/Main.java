package in.edu.tint.cse.lab.one.six;

public class Main {
    public static void main(String[] args) {
        StudentList sList = new StudentList();
        // Add students
        sList.addStudent("Abc",1,"B.Tech",80,85,90,70,75);
        sList.addStudent("Bcd",2,"B.Tech",70,75,80,75,74);
        sList.addStudent("Cde",3,"B.Tech",60,85,60,80,77);
        // Display all students
        sList.displayAll();
        sList.subWiseAvg(2); // Subject wise Average
        sList.stdWiseAvg(2); // Student wise Average
        System.out.println();
        // Student Details Modification
        sList.editName(0,"XYZ");
        sList.editCourse(0,"BCA");
        sList.editRoll(0, 10);
        sList.editSubMarks(0,1,100);
        // Delete Students
        sList.delStudent(1);
        sList.displayAll();

    }
}
