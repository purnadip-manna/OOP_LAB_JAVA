package in.edu.tint.cse.lab.one.two;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5);
        System.out.println("c1 = " + c1);
        Complex c2 = new Complex(2, -10);
        System.out.println("c2 = " + c2);

        c1.add(new Complex(10,-20)); // c1 = c1 + (10 - 20i)
        System.out.println("c1 = " + c1);

        c1.sub(new Complex(5,-15)); // c1 = c1 - (5 - 15i)
        System.out.println("c1 = " + c1);

        Complex c3;

        c3 = c1.addWith(c2);  // c3 = c1 + c2
        System.out.println("c3 = " + c3);

        c3 = c1.subFrom(c2); // c3 = c1 - c2
        System.out.println("c3 = " + c3);

        c3 = c1.mul(c2); // c3 = c1∗c2
        System.out.println("c3 = " + c3);
    }
}
