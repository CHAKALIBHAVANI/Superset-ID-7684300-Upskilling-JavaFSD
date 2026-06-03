// Class and Object Creation 
class Car {

    String make;
    String model;
    int year;

    // Display details
    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

class CarDemo {
    public static void main(String[] args) {

        Car car = new Car();

        car.make = "Toyota";
        car.model = "Camry";
        car.year = 2024;

        car.displayDetails();
    }
}