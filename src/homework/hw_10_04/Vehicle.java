package homework.hw_10_04;

public class Vehicle {
    public static void main(String[] args){
        Car car1 = new Car("JEEP","Rubicon","5");
        Motorcycle motorcycle1 = new Motorcycle("Ducati","Panigale Superleggera","No");
        System.out.println(car1.start());
        System.out.println(motorcycle1.start());
        System.out.println(car1.stop());
    }
    String brand;
    String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String start(){
        return brand + " " + model + " " + "Start ENGINE";
    }
    public String stop(){
        return brand + " " + model + " " +  "Stop ENGINE";
    }
}

class Car extends Vehicle{
    String numDoors;
    public Car(String brand, String model, String numDoors){
        super(brand, model);
        this.numDoors = numDoors;
    }
    @Override
    public String start(){
        return numDoors + " " + "doors"+ " " + super.start();
    }
    @Override
    public String stop(){
        return numDoors + " " + "doors"+ " " +  super.stop();
    }
}

class Motorcycle extends Vehicle{
    String hasSidecar;

    public Motorcycle(String brand, String model, String hasSidecar){
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public String start(){
        return hasSidecar + " " + "side car" + " " + super.start();
    }

    @Override
    public String stop(){
        return hasSidecar + " " + "side car" + " " + super.stop();
    }
}
