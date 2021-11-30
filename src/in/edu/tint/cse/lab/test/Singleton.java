package in.edu.tint.cse.lab.test;

public class Singleton {
    int a;
    private static Singleton obj = new Singleton(2);
    private Singleton(int a){
        this.a = a;
    }
    public static Singleton getObj(){
        return obj;
    }
}
