package homework.hw_28_03;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrandModel(String a, String b){
        return a + " " + b;
    }

    public String getFull(String a, String b, int c){
        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Porsche","Cayenne Turbo GT");
        Car car2 = new Car("Audi","Q8",2022);
        System.out.println(car1.getBrandModel(car1.brand, car1.model));
        System.out.println(car2.getBrandModel(car2.brand, car2.model));
        System.out.println(car2.getFull(car2.brand, car2.model,car2.year));
    }
}
