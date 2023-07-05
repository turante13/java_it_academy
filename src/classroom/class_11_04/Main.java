package classroom.class_11_04;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Error by division zero");
        }
    }
}
