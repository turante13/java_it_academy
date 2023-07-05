package classroom.class_25_03;

public class OuterClass {
    private static int outerStaticInt = 10;
    private int outerInt = 20;

    public class InnerClass{
        public void printValues(){
            System.out.println("Outer static int: " + outerStaticInt);
            System.out.println("Outer int: " + outerInt);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        InnerClass innerObj = outerObj.new InnerClass();
        innerObj.printValues();
    }
}
