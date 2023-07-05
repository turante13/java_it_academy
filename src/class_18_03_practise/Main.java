package class_18_03_practise;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Borya", 67);
        Person person2 = new Person("Makhachkala", 193, 75);
        Person person3 = new Person("Sildi", 175, 78);

        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.address + " " + person2.height + " " + person2.weight);
        System.out.println(person3.address + " " + person3.height + " " +  person3.weight);
    }
}
