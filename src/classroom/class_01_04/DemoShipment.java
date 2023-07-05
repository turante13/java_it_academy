package classroom.class_01_04;

class Box {
    private double width;
    private double height;
    private double depth;
    public Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    public Box(double len) {
        width = height = depth = len;
    }
    public double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    public BoxWeight(BoxWeight obj) {
        super(obj);
        weight = obj.weight;
    }
    public BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    public BoxWeight() {
        super();
        weight = -1;
    }
    public BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
class Shipment extends BoxWeight {
    double cost;
    public Shipment(Shipment obj) {
        super(obj);
        cost = obj.cost;
    }
    public Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    public Shipment() {
        super();
        cost = -1;
    }
    public Shipment(double len, double m, double c) {
        super(len, m); // конструктор super должен быть первым
        cost = c;
    }
}
//метод super () всегда ссылается на конструктор ближайшего по иерархии суперкласса !
public class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Oбъeм shipment1 равен " + vol);
        System.out.println("Bec shipment1 равен " + shipment1.weight);
        System.out.println("Cтoимocть доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки: $" + shipment2.cost);
    }
}
