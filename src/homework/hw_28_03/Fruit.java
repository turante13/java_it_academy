package homework.hw_28_03;

public class Fruit {
    String name;
    double weight;
    public Fruit(String name){
        this.name = name;
    }

    public Fruit(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(String a){
        return a;
    }

    public String getFull(String a, double b){
        return a + " " + b + " " + "gram";
    }

    public static void main(String[] args) {
        Fruit fruit_1 = new Fruit("Peach");
        Fruit fruit_2 = new Fruit("Grape",2.87);
        Fruit fruit_3 = new Fruit("Pineapple",4.56);
        System.out.println(fruit_3.getName(fruit_3.name));
        System.out.println(fruit_2.getFull(fruit_2.name,fruit_2.weight));
    }
}
