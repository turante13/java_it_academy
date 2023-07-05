package practise_class;

public class Practice_4 {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 29, "male");
        Person person2 = new Person("Magamed", 15, "male");

        if (person1.age > person2.age) {
            System.out.println(person1.name + " is elder " + person1.age);
        } else {
            System.out.println(person2.name + " is elder than " + person2.age);
        }
    }
}
class Person{
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" +
                name +
                '\'' +
                ", age=" +
                age +
                ", gender='" +
                gender +
                '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender +'\'' +'}';
//    }
}

