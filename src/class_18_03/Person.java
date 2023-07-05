package class_18_03;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Person createPerson(String name, int age){
        Person person = new Person(name, age);
        return person;
    }
}
