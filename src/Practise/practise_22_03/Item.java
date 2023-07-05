package Practise.practise_22_03;

public class Item {
    String name;
    String model;
    int cost;

    public Item(String name, String model, int cost){
        this.name = name;
        this.model = model;
        this.cost = cost;
    }

    public static String getName(Item item){
        return item.name;
    }

    public static String getModel(String model){
        return model;
    }

    public static int getCost(Item item){
        return item.cost;
    }

    public String getFull(){
        return name + " " + model + " " + cost;
    }
}
