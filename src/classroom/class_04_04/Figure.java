package classroom.class_04_04;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Area not recognized.");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Rectangle area.");
        return dim1 * dim2 / 2;
    }
}

//abstract class FigureAbstract{
//    double dim1;
//    double dim2;
//
//
//
//
//    abstract double area();
//}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Triangle area");
        return dim1 * dim2 / 2;
    }
}

class FindAreas{
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        Object ob = new Object();
        figref = r;
        System.out.println("Area equals" + " " + figref.area());
        figref = t;
        System.out.println("Area equals" + " " + figref.area());
        figref = f;
        System.out.println("Area equals" + " " + figref.area());
    }
}
