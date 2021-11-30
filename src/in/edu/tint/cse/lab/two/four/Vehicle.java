package in.edu.tint.cse.lab.two.four;

public class Vehicle {
    String compName;
    int price;
    private int vehicleId;
    static int vId=100001;

    public Vehicle(String compName, int price) {
        this.compName = compName;
        this.price = price;
        this.vehicleId = vId;
        vId++;
    }

    public String toString() {
        return "Vehicle{ " +
                "VehicleId = " + vehicleId +
                ", CompanyName = " + compName +
                ", Price = " + price +
                " }";
    }
}

