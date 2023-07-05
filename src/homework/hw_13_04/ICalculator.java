package homework.hw_13_04;

public interface ICalculator {
    public void addition();
    public void subtraction();
    public void multiplication();
    public void division();
}

class SimpleCalculator implements ICalculator{
    double a;
    double b;

    public SimpleCalculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void addition(){
        System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + (a + b));
    }

    @Override
    public void subtraction(){
        System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + (a - b));
    }

    @Override
    public void multiplication(){
        System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + (a * b));
    }

    @Override
    public void division(){
        System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + (a / b));
    }

    public static void main(String[] args){
        SimpleCalculator math = new SimpleCalculator(13,8);
        math.addition();
        math.subtraction();
        math.multiplication();
        math.division();
    }
}
