package classroom.class_25_03;

public class Demo {
    public static void main(String[] args) {
        String strOb1 = "First line";
        String strOb2 = "Second line";
        String strOb3 = strOb1;

        System.out.println("Length of the line strOb1: " + strOb1.length());
        System.out.println("Symbol by index 3 " + "in the line strOb1 " + strOb1.charAt(3));

        if(strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}
