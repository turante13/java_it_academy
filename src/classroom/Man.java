package classroom;

public class Man {
    public static void main(String[] args) {

        Person myPerson1 = new Person();
        Person myPerson2 = new Person();
        Person myPerson3 = new Person();
        Person myPerson4 = new Person();

        myPerson1.age = 23;
        myPerson1.height = 168;
        myPerson1.name = "Maga";
        myPerson1.address = "Hushet";

        myPerson2.age = 18;
        myPerson2.height = 178;
        myPerson2.name = "Borya";
        myPerson2.address = "Makhachkala";

        myPerson3.age = 26;
        myPerson3.height = 178;
        myPerson3.name = "Pulya";
        myPerson3.address = "Sildi";

        myPerson4.age = 28;
        myPerson4.height = 184;
        myPerson4.name = "Troy";
        myPerson4.address = "Bishkek";


        System.out.println("First person:  " + myPerson1.name + " " + myPerson1.age + " " +  myPerson1.height + " " +  myPerson1.address);
        System.out.println("Second person:  " + myPerson2.name + " " + myPerson2.age + " " +  myPerson2.height + " " +  myPerson2.address);
        System.out.println("Third person:  " + myPerson3.name + " " +  myPerson3.age + " " +  myPerson3.height + " " +  myPerson3.address);
        System.out.println("Fourth person:  " + myPerson4.name + " " +  myPerson4.age + " " +  myPerson4.height + " " +  myPerson4.address);
    }
}
