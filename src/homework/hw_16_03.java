package homework;

import java.util.Scanner;

public class hw_16_03 {
    public static void main(String[] args){
        int[] array = {98, 45, 34, 677, 89};
        String text = "Attaboy, roger roger that ";

        String text1 = "Boom shakalaka";
        System.out.println(getSum(12,34));
        System.out.println(getAvg(array));
        System.out.println(getMax(array));
        System.out.println(getLength(text));
        System.out.println(concatenate(text, text1));
    }

    public static double getSum(int a, int b){
        int c = a + b;
        return c;
    }

    public static int getAvg(int[] array){
        int sum = 0;
        int length = array.length;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / length;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int getLength(String a){
        int stringSize = a.length();
        return stringSize;
    }

    public static String concatenate(String a, String b){
        String c = a + b;
        return c;
    }
}
