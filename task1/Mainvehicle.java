
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}

// Car subclass
class Car extends Vehicle {
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }

    public double getTrunkSize() { return trunkSize; }

    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be positive.");
        }
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    public double getPayloadCapacity() { return payloadCapacity; }

    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }
}

// Main class to test Vehicle, Car, and Truck
public class Mainvehicle {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "Swift", 2015, 15.1);
        car.displayDetails();
        
        System.out.println(); // blank line for readability
        
        Truck truck = new Truck("Ford", "F-150", 2016, 3.5);
        truck.displayDetails();
    }
}