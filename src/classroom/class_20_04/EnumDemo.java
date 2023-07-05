package classroom.class_20_04;

enum Apple{
    Jonathan,
    GoldenDel,
    RedDel,
    Winesap,
    Cortland
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;

        apple = Apple.RedDel;

        System.out.println("apple: " + apple);
        System.out.println();

        apple = Apple.GoldenDel;

        if (apple == Apple.GoldenDel)
            System.out.println("Variable App exists GoldenDel. \n");
        switch (apple){

        }

    }
}
