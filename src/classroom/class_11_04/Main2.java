package classroom.class_11_04;

public class Main2 {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("Division by zero: " + e);
        } catch (Exception e){
            System.out.println("Index ERROR out of bounds");
            System.out.println("After try/catch methods");
        }
    }
}
