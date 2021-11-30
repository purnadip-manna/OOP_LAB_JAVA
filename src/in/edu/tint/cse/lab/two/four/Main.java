package in.edu.tint.cse.lab.two.four;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String compName;
        int price;
        float mileage;
        int capInTons;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Vehicle: ");
        int n = scan.nextInt();
        LightMotorVehicle[] lightMotorVehicles = new LightMotorVehicle[n];
        HeavyMotorVehicle[] heavyMotorVehicles = new HeavyMotorVehicle[n];
        int i = 0;
        int j = 0;
        for (int k = 0; k < n; k++) {
            System.out.println("Vehicle type [Light Motor/Heavy Motor] (l/h)?");
            String type = scan.next();
            if (type.equals("l")){
                System.out.print("Company Name: ");
                compName = scan.next();
                System.out.print("Price: ");
                price = scan.nextInt();
                System.out.print("Mileage: ");
                mileage = scan.nextFloat();
                lightMotorVehicles[i] = new LightMotorVehicle(compName, price, mileage);
                i++;
            }
            else {
                System.out.print("Company Name: ");
                compName = scan.next();
                System.out.print("Price: ");
                price = scan.nextInt();
                System.out.print("Capacity in tons: ");
                capInTons = scan.nextInt();
                heavyMotorVehicles[j] = new HeavyMotorVehicle(compName, price, capInTons);
                j++;
            }
        }
        scan.close();
        for (int k = 0; k < i; k++) {
            System.out.println(lightMotorVehicles[k].display());
        }
        for (int k = 0; k < j; k++) {
            System.out.println(heavyMotorVehicles[k].display());
        }
    }
}
