package classroom.class_16_05;

interface A{
    int sum(int a, int b);
}

public class Main implements A{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        A a = new Main();
        System.out.println(a.sum(3, 8));

        A a1 = Integer::sum;
        System.out.println(a1.sum(2,6));
    }
}
