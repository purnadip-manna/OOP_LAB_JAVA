package in.edu.tint.cse.lab.two.one;

public class Triangle extends Shape{
    float base;
    float height;
    Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    float calculateArea(){
        return (0.5f*this.base*this.height);
    }
    void display(){
        System.out.println("Base: "+this.base);
        System.out.println("Height: "+this.height);
    }
}