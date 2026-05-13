class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    void drive() {
        System.out.println("Driving a bike");
    }
}

public class Program11_VehicleDrive {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();

        Bike b = new Bike();
        b.drive();
    }
}