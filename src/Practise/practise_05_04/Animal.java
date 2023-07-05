package Practise.practise_05_04;

public class Animal {
    public void speak(){
        System.out.println("making sound");
    }
}

class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("Dogs woofing. ");
    }

    public void fetch(){
        System.out.println("Dogs fetching ball. ");
    }
}

class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Cats meowing. ");
    }
    public void scratch(){
        System.out.println("Cat scratching the furniture. ");
    }
}

class MainI{
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.speak();

        if (animal1 instanceof Dog){
            Dog dog = (Dog) animal1;
            dog.fetch();
        }

        animal2.speak();

        if (animal2 instanceof Cat){
            Cat cat = (Cat) animal2;
            cat.scratch();
        }
    }
}
