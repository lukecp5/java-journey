public class BasicCar {

    // ! Total miles driven by the car
    private int milesDriven;
    private int fuelLevel;

    // Constructor assigns initial values to instance variables
    public BasicCar(int miles, int fuel) {
        this.fuelLevel = fuel;
        this.milesDriven = miles;
    }

    public BasicCar() {
        milesDriven = 0;
        fuelLevel = 0;
    }

    public int changeFuel(int fuel) {
        fuelLevel = fuel;
        return fuelLevel;
    }

    public int checkFuel() {
        return fuelLevel;
    }

    // Drive the requested miles
    public void drive(int tripMiles) {
        milesDriven = milesDriven + tripMiles;
    }

    // INFO: Return total number of miles driven
    public int checkOdometer() {
        return milesDriven;
    }

    // Note: Main() creates objects of type BasicCar and
    // Note: calls methods to operate on the objects
    public static void main(String[] args) {
        BasicCar redCorvette = new BasicCar();
        BasicCar fordMustang = new BasicCar();
        BasicCar newMustang = new BasicCar(1000, 50);

        redCorvette.drive(100);
        fordMustang.drive(75);
        fordMustang.drive(300);
        fordMustang.drive(50);

        System.out.println("Fuel before mod: " + newMustang.checkFuel());
        System.out.println(newMustang.checkOdometer());

        newMustang.changeFuel(100);
        newMustang.drive(100);
        System.out.println("Fuel after mod: " + newMustang.checkFuel());
        System.out.println("After mile mod: " + newMustang.checkOdometer());
    }
}