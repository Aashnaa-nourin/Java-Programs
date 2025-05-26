class Car {
    String color;
    String model;
    void displayInfo() {
        System.out.println("Car model: " + model + ", Color: " + color);
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.displayInfo();
    }
}
