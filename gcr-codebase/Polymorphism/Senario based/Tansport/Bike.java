package polyphorphisim;
 class Bike extends Vehicle {
Bike(String name){
    super(name);

}
public int costFuel(int km){
    return 20*km;
}
}
