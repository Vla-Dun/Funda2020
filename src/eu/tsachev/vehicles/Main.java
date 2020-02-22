package eu.tsachev.vehicles;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String input = scan.nextLine();
        while (!"End".equals(input)) {


            String[] tokens = input.split("\\s+");

            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horse = Integer.parseInt(tokens[3]);

            Vehicle veh;

            if ("car".equals(type)) {
                veh = new Vehicle("Car", model, color, horse);
                vehicles.add(veh);
            } else {
                veh = new Vehicle("Truck", model, color, horse);
                vehicles.add(veh);
            }

            input = scan.nextLine();


        }
        String command = scan.nextLine();

        while (!"Close the Catalogue".equals(command)) {
            for (Vehicle vehi : vehicles) {
                if (vehi.getModel().equals(command)) {
                    System.out.println(vehi.toString());
                }

            }
            command = scan.nextLine();


        }
        double carphp = printHorsePower(vehicles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carphp));
        double truckhp = printHorsePower(vehicles, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckhp));


    }

    public static double printHorsePower(ArrayList<Vehicle> vehicles, String type) {

        double sum = 0.0;
        double counter = 0;

        for (Vehicle vehicle : vehicles
        ) {
            if (vehicle.getType().equals(type)) {
                sum += vehicle.getHorsepower();
                counter++;
            }

        }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }

}