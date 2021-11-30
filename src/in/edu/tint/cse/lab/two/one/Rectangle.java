package in.edu.tint.cse.lab.two.one;

public class Rectangle extends Shape{
    float length;
    float width;
    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    float calculateArea(){
        return (this.length*this.width);
    }
    void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Width: "+this.width);
    }
}
