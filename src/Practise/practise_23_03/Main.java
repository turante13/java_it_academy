package Practise.practise_23_03;

public class Main {
    public static int[] addNum(int a[]){
        for (int i = 0; i < a.length; i++){
            a[i] = a[i] + 1;
        } for (int j = 0; j < a.length; j++){
            System.out.print(a[j] + "  ");
        }
        return a;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(addNum(array));

    }
}
