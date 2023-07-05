package Practise.practise_14_04;

abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name + " " + "is eating");
    }
    abstract void makeSound();
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println(name + " " + "says woof!");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    void makeSound(){
        System.out.println(name + " " + "says meow!");
    }
}

public class Chakra {
    public static void main(String[] args){
        Animal a1 = new Dog("Pulya");
        Animal a2 = new Cat("Chorsh");

        a1.makeSound();
        a1.eat();

        a2.makeSound();
        a2.eat();

        int a = 5;
        int b = 0;
        int c;

        try{
            c = a / b;
        }catch (ArithmeticException arithmeticException){
            System.out.println("cannot divide zero");
        }
    }
}
