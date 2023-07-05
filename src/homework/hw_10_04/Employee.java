package homework.hw_10_04;

public class Employee {
    public static void main(String[] args){
        Employee employee1 = new Employee("Pers",40000);
        Manager manager1 = new Manager("Troi",250000,20000);
        Clerk clerk1 = new Clerk("Elf",60000,10000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        System.out.println(manager1.getName());
        System.out.println(manager1.getSalary());
        System.out.println(clerk1.getName());
        System.out.println(clerk1.getSalary());
    }
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

     public String getName(){
         return "Name: " + name + " ";
     }

     public int getSalary(){
         return salary;
     }
}

class Manager extends Employee{
    int bonus;

    public Manager(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    public int getSalary(){
        return super.getSalary() + bonus;
    }
}

class Clerk extends Employee{
    int overtime;
    public Clerk(String name, int salary, int overtime){
        super(name, salary);
        this.overtime = overtime;
    }
    @Override
    public int getSalary(){
        return super.getSalary() + overtime;
    }
}
