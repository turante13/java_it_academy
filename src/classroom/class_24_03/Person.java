package classroom.class_24_03;

public class Person {
        private static int objectCount = 0;
        public Person(){objectCount++;}
        public static int getObjectCount(){return objectCount;}
    }
    class Main{
        public static void main(String[] args) {
            Person person = new Person();
            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();
            Person person4 = new Person();
            System.out.println("Amount of made objects " + Person.getObjectCount());
        }
    }

