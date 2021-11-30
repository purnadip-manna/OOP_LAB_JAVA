package in.edu.tint.cse.lab.one.one;

public class Main {
    public static void main(String[] args) {
        // Take the time as input in 24-hour format.

        Time t = new Time(20,3,20);
        t.display();

        Time t1 = new Time(12,59,20);
        t1.display();

        Time t2 = new Time(8,45,20);
        t2.display();

        Time t3 = new Time();
        t3.display();
    }
}
