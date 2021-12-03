package lab.matrix;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, c, val;
        Scanner scan = new Scanner(System.in);
        System.out.print("(1st Matrix) Row no: ");
        r = scan.nextInt();
        System.out.print("(1st Matrix) Col no: ");
        c = scan.nextInt();
        Matrix m1 = new Matrix(r, c);
        System.out.println("Enter the elements of 1st Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                val = scan.nextInt();
                m1.setElementAt(i, j, val);
            }
        }
        System.out.println("M1 = " + m1);

        System.out.print("(2nd Matrix) Row no: ");
        r = scan.nextInt();
        System.out.print("(2nd Matrix) Col no: ");
        c = scan.nextInt();
        Matrix m2 = new Matrix(r, c);
        System.out.println("Enter the elements of 2st Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                val = scan.nextInt();
                m2.setElementAt(i, j, val);
            }
        }
        System.out.println("M2 = " + m2);

        try {
            Matrix result = Matrix.add(m1, m2);
            System.out.println("Result = " + result);
        } catch (AdditionNotPossibleException e) {
            System.out.println(e);
        } finally {
            System.out.println("Program terminated successfully!");
        }

        scan.close();
    }
}