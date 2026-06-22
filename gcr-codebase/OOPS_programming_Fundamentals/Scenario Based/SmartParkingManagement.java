class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
}

public class SmartParkingManagement {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("UP01A1", "Pragati", "Car"),
                new Vehicle("UP01A2", "Aman", "Bike"),
                new Vehicle("UP01A3", "Riya", "Car"),
                new Vehicle("UP01A4", "Rahul", "Bike"),
                new Vehicle("UP01A5", "Neha", "Car"),
                new Vehicle("UP01A6", "Karan", "Bike"),
                new Vehicle("UP01A7", "Anjali", "Car"),
                new Vehicle("UP01A8", "Rohit", "Bike"),
                new Vehicle("UP01A9", "Simran", "Car"),
                new Vehicle("UP01A10", "Vikas", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
