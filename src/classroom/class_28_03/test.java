package classroom.class_28_03;

public class test {
    public static void main(String[] args) {
        printNames(new int[]{1, 2, 3});
    }
    public static void printNames(int[] names) {
        for (int name : names){
            System.out.println(name);
        }
    }
}
