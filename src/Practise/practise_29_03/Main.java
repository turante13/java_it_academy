package Practise.practise_29_03;

public class Main{
    public static void main(String[] args) {
        Tiger tiger = new Tiger(false, "meat", 2);
        System.out.println("Is it vegetarian? " + tiger.isVegetarian() );
        System.out.println("How many legs? " + tiger.getNoOfLegs());
        System.out.println("What is the color? " + tiger.getColor());
        System.out.println("What does it eat? " + tiger.getEats());
    }
}
