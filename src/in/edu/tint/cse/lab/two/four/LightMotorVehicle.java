package in.edu.tint.cse.lab.two.four;

public class LightMotorVehicle extends Vehicle {
    float mileage;

    public LightMotorVehicle(String compName, int price, float mileage) {
        super(compName, price);
        this.mileage = mileage;
    }

    String display(){
        return "LightMotorVehicle{ Mileage = " + mileage + " " + super.toString() + " }";
    }
}
