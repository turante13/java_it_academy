package Practise.phone_demo;

public class Phone {
    int number;
    String model;
    String weight;

    public Phone(int number, String model, String weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public String receiveCall(String a){
        return a + " " + "Calling";
    }

    public int getNumber(int a){
        return a;
    }
    public static void main(String[] args){
        Phone phone_1 = new Phone(990899999, "OnePlus");
        Phone phone_2 = new Phone(987444793,"Samsung", "187g");
        Phone phone_3 = new Phone(998776887, "iPhone","198g");

        System.out.println(phone_1.number);
        System.out.println(phone_2.model);
        System.out.println(phone_3.weight);


    }
}
