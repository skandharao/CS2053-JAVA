class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year : " + year);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class LAB3 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar("Tesla", 2023, "Model 3", 75);
        ec.displayInfo();
    }
}

