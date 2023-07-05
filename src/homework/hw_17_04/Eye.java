package homework.hw_17_04;

abstract class Animal{
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog is eating.");
    }
    public void sleep(){
        System.out.println("Dog is sleeping.");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat is eating.");
    }
    public void sleep(){
        System.out.println("Cat is sleeping.");
    }
}

class Bird extends Animal implements Flying{
    public void eat(){
        System.out.println("Bird is eating.");
    }
    public void sleep(){
        System.out.println("Bird is sleeping.");
    }
    public void fly(){
        System.out.println("Bird is flying.");
    }
}

interface Flying{
    public void fly();
}

public class Eye {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Bird bird1 = new Bird();
        dog1.eat();
        dog1.sleep();
        cat1.sleep();
        bird1.eat();
        ((Flying) bird1).fly();
    }
}