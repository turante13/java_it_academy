package classroom.class_30_03;

public class Demo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,4,5,8.57);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);

        plainbox = weightbox;
        vol = plainbox.volume();

        System.out.println("Volume of plainbox is " + vol);
    }
}
