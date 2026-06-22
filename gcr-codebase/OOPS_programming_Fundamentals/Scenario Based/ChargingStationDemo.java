class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 8.5;

    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station: " + stationId +
                ", Units: " + unitsConsumed +
                ", Bill: ₹" + calculateBill());
    }
}

public class ChargingStationDemo {
    public static void main(String[] args) {
        ChargingStation[] stations = {
                new ChargingStation("CS1", 100),
                new ChargingStation("CS2", 150),
                new ChargingStation("CS3", 120),
                new ChargingStation("CS4", 180),
                new ChargingStation("CS5", 90)
        };

        for (ChargingStation s : stations) {
            s.displayStationDetails();
        }

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        ChargingStation.electricityRate = 10;

        System.out.println("\nAfter Rate Change:");
        for (ChargingStation s : stations) {
            s.displayStationDetails();
        }
    }
}
