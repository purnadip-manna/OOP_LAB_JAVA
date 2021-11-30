package in.edu.tint.cse.lab.two.one;

public class Main {
    public static void main(String[] args){
        // Rectangle -------
        System.out.println("Rectangle:");
        Rectangle r = new Rectangle(10.2f, 20f);
        r.display();
        System.out.println("Area: "+r.calculateArea());

        System.out.println("-------------------------");
        // Triangle --------
        System.out.println("Triangle:");
        Triangle t = new Triangle(6, 5);
        t.display();
        System.out.println("Area: "+t.calculateArea());

    }
}
