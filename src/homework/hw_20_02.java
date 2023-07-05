package homework;

import java.util.Scanner;

public class hw_20_02 {
    public static void main(String[] args){
        int[] num = {23, 42, 23, 78, 91, 29, 11, -34, 2};

//        double sum = 0;
//        int minNum = num[0];
//        int maxNum = 0;

//        for (int i = 0; i < num.length; i++){
//            sum += num[i];
//        }
//
//        for (int i = 0; i < num.length; i++){
//            if (minNum > num[i]){
//                minNum = num[i];
//            }
//        }
//
//        for (int i = 0; i < num.length; i++){
//            if (maxNum <= num[i]){
//                maxNum = num[i];
//            }
//        }
//
//        double average = sum / num.length;
//
//        System.out.println("Average of array: " + average);
//        System.out.println("Minimal number in array: " + minNum);
//        System.out.println("Maximum number in array: " + maxNum);
//
//        Scanner scan = new Scanner(System.in);
//        boolean found = false;
//        int a = scan.nextInt();
//        for (int i = 0; i < num.length; i++){
//            if (a == num[i]){
//                System.out.println("Number " + num[i] + " exists in array.");
//                found = true;
//            }
//        }
//        if (!found){
//            System.out.println("There is no such element");
//        }
            int counter = 0;
        for (int i = 0; i < num.length; i++){
            boolean prime = true;
            for (int j = 2; j < num[i]; j++){
                if (num[i] % j == 0){
                    prime = false;
                }

            }
            if (prime && num[i] > 1){
                counter++;
                System.out.println(num[i]);
            }
        }
        System.out.println("Quantity of prime numbers: " + counter);

    }
}
