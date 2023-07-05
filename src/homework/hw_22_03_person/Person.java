package homework.hw_22_03_person;

public class Person {
    String name;
    String surname;
    String middleName;
    String sex;
    int age;

    public Person(String name, String surname, String middleName){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    public Person(String sex, int age){
        this.sex = sex;
        this.age = age;
    }

    public String getFullName(String a, String b, String c){
        return a + " " + b + " " + c;
    }

    public String getAgeSex(String a, int b){
        return a + " " + b;
    }

    public static void main(String[] args){
        Person person1 = new Person("Turan", "Gaspar", "Troi");
        Person person2 = new Person("male", 28);

        System.out.println(person1.getFullName("Borya", "Israpil", "Angel"));
        System.out.println(person2.getAgeSex("male",87));


    }



}
