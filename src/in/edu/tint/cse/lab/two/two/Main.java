package in.edu.tint.cse.lab.two.two;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("PQR", 18, "M", 1, "CSE", "B.Tech");
        System.out.println(s1.toString());
        System.out.println();
        Teacher t1 = new Teacher("ABC", 40, "M","OOP", "CSE", 65000);
        System.out.println(t1.toString());
    }
}
