package in.edu.tint.cse.lab.test;

public class Cp {
    int a;
    int b;
    Cp(int a, int b){
        this.a = a;
        this.b = b;
    }
    Cp(Cp c){
        a = c.a;
        b= c.b;
    }
}
