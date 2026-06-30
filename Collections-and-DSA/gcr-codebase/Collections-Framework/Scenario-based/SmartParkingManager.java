import java.util.*;

public class SmartParkingManager {
    static ArrayList<String> vehicles = new ArrayList<>();

    public static void enterVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " entered.");
    }

    public static void exitVehicle(String number) {
        if (vehicles.remove(number)) {
            System.out.println(number + " exited.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public static void searchVehicle(String number) {
        if (vehicles.contains(number)) {
            System.out.println("Vehicle is parked.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    public static void displayVehicles() {
        System.out.println("Parked Vehicles: " + vehicles);
        System.out.println("Total Slots Occupied: " + vehicles.size());
    }

    public static void main(String[] args) {
        enterVehicle("UP87AB1234");
        enterVehicle("DL05XY5678");

        searchVehicle("UP87AB1234");
        displayVehicles();
        exitVehicle("DL05XY5678");
    }
}