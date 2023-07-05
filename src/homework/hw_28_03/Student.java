package homework.hw_28_03;

public class Student {
    String name;
    int age;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getInfo(String a, int b){
        return a + " " + b;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Borya");
        Student student2 = new Student("Magamed",29);
        System.out.println(student1.getInfo(student1.name, student1.age));
        System.out.println(student1.getInfo(student2.name, student2.age));
    }
}
