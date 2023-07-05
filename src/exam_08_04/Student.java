package exam_08_04;

public class Student {
    String name;
    int age;
    double average;

    public Student(String name, int age, double average){
        this.name = name;
        this.age = age;
        this.average = average;
    }
    public String info(){
        return name + " " + age + " " + average;
    }

    public static void main(String[] args){
        Student student1 = new Student("Borya", 25, 4.5);
        Student student2 = new Student("Lahmi", 20, 3.5);
        Student student3 = new Student("Uci", 29, 4.0);
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
    }
}


