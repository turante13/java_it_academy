package classroom;

public class CarModel {
    public static void main(String[] args){
        Cars car = new Cars();
        PersonCar person = new PersonCar();



        car.name = "Porsche";
        car.model = "911 GT3 RS";
        car.power = "1200 HP";
        car.color = "Black";
        car.cost = 170000;
        car.year = 2022;

        person.name = "Gaspar";

        System.out.println(car.name + " " + car.model + " " + car.power + " " + car.color + " " + car.cost + " " + car.year + " " + person.name);

    }
}
