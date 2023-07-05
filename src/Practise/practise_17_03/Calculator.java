package Practise.practise_17_03;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(1,2);
        double result2 = calculator.add(2.5,3.5);
        String result3 = calculator.add("Hello", "World!");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }


}
