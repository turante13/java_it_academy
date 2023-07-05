package classroom.class_24_03;

public class Example {
    public static final double PI = 3.14159265359;
    public static double getCircleArea(double radius){
        return PI * radius * radius;
    }

    public void printMessage(){
        System.out.println("This is demo method!");
    }

    public static void main(String[] args){
        double radius = 5.0;
        double circleArea = Example.getCircleArea(radius);
        System.out.println("Circle radius square " + radius + " = " + circleArea);

        Example example = new Example();
        example.printMessage();
    }
}

