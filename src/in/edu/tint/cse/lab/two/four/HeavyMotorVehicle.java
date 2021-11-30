package in.edu.tint.cse.lab.two.four;

public class HeavyMotorVehicle extends Vehicle{
    int capInTons;

    public HeavyMotorVehicle(String compName, int price, int capInTons) {
        super(compName, price);
        this.capInTons = capInTons;
    }

    String display(){
        return "HeavyMotorVehicle{ Capacity-in-tons = " + capInTons + " " + super.toString() + " }";
    }
}
