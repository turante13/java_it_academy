package class_16_03;

public class Calculate {
    public void sumNumbers(){
        System.out.println("_");
    }
    public void sumNumbers(int a, int b){
        System.out.println("a and b " + a + " " + b);
    }
    public void sumNumbers(int a, int b, int c){
        System.out.println("a, b and c " + a + " " + b + " " + c);

    }
    public void sumNumbers(double a, double b){
        System.out.println("a and b " + a + " " + b);
    }
}

class CalcDemo{
    public static void main(String[] args){
        Calculate calculate = new Calculate();
        calculate.sumNumbers(23, 67);
        calculate.sumNumbers(78.6, 68.9);
        calculate.sumNumbers(123,563,678);
        calculate.sumNumbers();
    }
}

class Calculate2{
    int a, b, c, d;
}
