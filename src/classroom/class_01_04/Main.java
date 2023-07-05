package classroom.class_01_04;

class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    public void giveBirth() {
        System.out.println("Mammal gives birth");
    }
}
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println("Bird flies");
    }
}
class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Eagle screeches");
    }
}
class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Penguin honks");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal");
        animal.makeSound();
        Mammal mammal = new Mammal("Generic mammal");
        mammal.giveBirth();
        Dog dog = new Dog("Fido");
        dog.makeSound();
        Cat cat = new Cat("Whiskers");
        cat.makeSound();
        Bird bird = new Bird("Generic bird");
        bird.fly();
        Eagle eagle = new Eagle("Baldy");
        eagle.makeSound();
        Penguin penguin = new Penguin("Waddles");
        penguin.makeSound();
    }
}
