package classroom.class_13_05;

interface NumericFunc {
    int func(int n);
}
class BlockLambdaDemo {
    public static void main(String[] args){
        NumericFunc factorial = b -> {
            int result = 1;
            for (int i = 1; i <= b; i++)
                result = i * result;
                return result;
            };
        System.out.println("Factorial number 3 is " + factorial.func(3));
        System.out.println("Factorial number 5 is " +
                "" + factorial.func(5));
    }
}
