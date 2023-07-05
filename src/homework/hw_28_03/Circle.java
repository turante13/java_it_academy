package homework.hw_28_03;

public class Circle {
    public static final double PI = 3.14159265359;
    double radius;
    double diameter;

    public Circle(double radius, double diameter){
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getCircumference(double a){
        return 2 * PI * a;
    }

    public static void main(String[] args){
        Circle circle1 = new Circle(4,8);
        System.out.println(circle1.getCircumference(circle1.radius));

    }


}
