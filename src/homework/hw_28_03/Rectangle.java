package homework.hw_28_03;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getSquare(int a, int b){
        return a * b;
    }

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4,5);
        System.out.println(rectangle1.getSquare(6,7));
    }

}
