package homework.hw_10_04;

public class Animal {
    String name;
    int age;

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.voice());
        System.out.println(cat.voice());
    }

}

class Dog extends Animal{
    public String voice(){
        return "Woooof";
    }

}

class Cat extends Animal{
     public String voice(){
         return "Meoww";
     }
}


