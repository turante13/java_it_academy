package classroom.class_28_03;
class Vehicle {
    protected String brand = "Unknown";
    protected String model = "Unknown";

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle{
    private int doors;

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return doors;
    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setDoors(4);
        car.displayInfo();
        System.out.println("Doors: " + car.getDoors());
    }
}


