package class_18_03;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){

        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
