package in.edu.tint.cse.lab.one.two;

public class Complex {
    // Complex number = x + iy
    int x;
    int y;

    Complex(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Addition to calculate c1 = c1 + c2
    void add(Complex c){
        this.x += c.x;
        this.y += c.y;
    }

    //Addition to calculate c3 = c1 + c2
    Complex addWith(Complex c){
        int x = this.x + c.x;
        int y = this.y + c.y;
        return new Complex(x,y);
    }

    //Subtraction to calculate c1 = c1 − c2
    void sub(Complex c){
        this.x += c.x;
        this.y += c.y;
    }

    //Subtraction to calculate c3 = c1 −c2
    Complex subFrom(Complex c){
        int x = this.x - c.x;
        int y = this.y - c.y;
        return new Complex(x,y);
    }

    //Multiplication to calculate c3 = c1 ∗ c2
    Complex mul(Complex c){
        int x = this.x *c.x;
        int y = this.y *c.y *(-1);
        return new Complex(x,y);
    }

    @Override
    public String toString() {
        if (y >0)
            return (x +"+"+ y +"i");
        else
            return (x +""+ y +"i");
    }
}
