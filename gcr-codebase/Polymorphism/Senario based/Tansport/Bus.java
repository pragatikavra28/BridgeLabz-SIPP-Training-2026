package polyphorphisim;

class Bus extends Vehicle {
    Bus(String name){
        super(name);
    }
    public int costFuel(int km){
        return 10*km;
    }
}
