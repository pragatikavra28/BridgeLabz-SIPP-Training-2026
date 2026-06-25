package polyphorphisim;

public class MainTransport {
    public static void main(String[] args) {
        Car car=new Car("Maruti");
        Bus  bus=new Bus("Local Tansport");
        Bike bike=new Bike("Honda");

        Vehicle[] vehicles={car,bus,bike};
        for(Vehicle ele:vehicles){
            System.out.println(ele.costFuel(1));
        }
    }
}
