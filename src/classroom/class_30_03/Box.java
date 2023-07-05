package classroom.class_30_03;

public class Box {
    double width;
    double height;
    double depth;

    public double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;

    }
}
