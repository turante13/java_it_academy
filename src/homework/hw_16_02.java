package homework;

public class hw_16_02 {
    public static void main(String[] args){
        Car car_1 = new Car ("BMW M3", 50000);
        Car car_2 = new Car ("Porsche Cayenne", 110000);
        if (car_1.cost > car_2.cost) {
            System.out.println(car_2.name + " is cheaper than " + car_1.name);
        } else {
            System.out.println(car_1.name + " is cheaper than " + car_2.name);
        }
    }
}

class Car{
    public String name;
    public int cost;

    public Car(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
}
