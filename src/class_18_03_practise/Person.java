package class_18_03_practise;

public class Person {
    String name;
    int age;
    String address;
    int height;
    int weight;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String address, int height, int weight){
        this.address = address;
        this.height = height;
        this.weight = weight;
    }
}
