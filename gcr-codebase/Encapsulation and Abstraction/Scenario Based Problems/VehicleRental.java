abstract class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    private double dailyRate;

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Bike extends Vehicle {
    private double dailyRate;

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

class Truck extends Vehicle {
    private double dailyRate;
    private double loadingCharge;

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Car car = new Car();
        car.setVehicleNumber("C101");
        car.setVehicleType("Car");
        car.setDailyRate(1000);

        Bike bike = new Bike();
        bike.setVehicleNumber("B202");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();
        truck.setVehicleNumber("T303");
        truck.setVehicleType("Truck");
        truck.setDailyRate(2000);
        truck.setLoadingCharge(1500);

        System.out.println(car.calculateRentalCost(3));
        System.out.println(bike.calculateRentalCost(3));
        System.out.println(truck.calculateRentalCost(3));
    }
}