package hw_22_03_rectangle;

public class Rectangle {
        int length;
        int width;

        public Rectangle(int length, int width){
            this.length = length;
            this.width = width;
        }

        public Rectangle(int length){
            this.length = length;
        }

        public int getSquare(int a, int b){
            return a * b;
        }
        public int getPerimeter(int a, int b){
            return a + a + b + b;
        }


        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(12);
            Rectangle rectangle2 = new Rectangle(23);

            System.out.println(rectangle2.getPerimeter(34,45));
            System.out.println(rectangle1.getSquare(2,5));
        }
}

