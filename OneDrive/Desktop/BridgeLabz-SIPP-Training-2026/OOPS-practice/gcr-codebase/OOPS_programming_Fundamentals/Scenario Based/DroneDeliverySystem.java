class Drone {
    private String droneId;
    private int batteryPercentage;
    static String companyName = "SkyExpress Logistics";

    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        System.out.println(droneId + " started delivery.");
    }

    public void displayStatus() {
        System.out.println("Drone ID: " + droneId +
                ", Battery: " + batteryPercentage + "%" +
                ", Company: " + companyName);
    }
}

public class DroneDeliverySystem {
    public static void main(String[] args) {
        Drone d1 = new Drone("D101", 90);
        Drone d2 = new Drone("D102", 75);
        Drone d3 = new Drone("D103", 60);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}
