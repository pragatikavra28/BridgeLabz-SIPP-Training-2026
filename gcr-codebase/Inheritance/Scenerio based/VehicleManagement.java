interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryLevel;

    ElectricVehicle(String model, int maxSpeed, int batteryLevel) {
        super(model, maxSpeed);
        this.batteryLevel = batteryLevel;
    }

    void charge() {
        System.out.println(model + " is charging. Battery level: " + batteryLevel + "%");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelLevel;

    PetrolVehicle(String model, int maxSpeed, int fuelLevel) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Fuel level: " + fuelLevel + " litres");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 80);
        PetrolVehicle pv = new PetrolVehicle("Toyota Camry", 200, 45);

        System.out.println("--- Electric Vehicle ---");
        ev.displayInfo();
        ev.charge();

        System.out.println("\n--- Petrol Vehicle ---");
        pv.displayInfo();
        pv.refuel();

        System.out.println("\n--- IS-A Checks ---");
        System.out.println("ElectricVehicle IS-A Vehicle:  " + (ev instanceof Vehicle));
        System.out.println("PetrolVehicle IS-A Vehicle:    " + (pv instanceof Vehicle));
        System.out.println("PetrolVehicle IS-A Refuelable: " + (pv instanceof Refuelable));
    }
}