package classroom;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class_21_02 {
    public static void main(String[] args){
//        int[][] a = new int[3][];
//        a[0] = new int [7];
//        a[1] = new int [2];
//        a[2] = new int [10];
//
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[i].length; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

//        String[] names = {"Alice", "Bob", "Charlie", "David", "Emily"};
//        int[] ages = {25, 30, 20, 35, 28};
//
//        System.out.println("User data:");
//        for (int i = 0; i < names.length; i++){
//            System.out.println(names[i] + ", " + ages[i] + " years old");
//        }
//        int ageToFind = 35;
//        for (int i = 0; i < ages.length; i++){
//            if (ages[i] == ageToFind){
//                System.out.println("Name with age " + ageToFind + ": " + names[i]);
//                break;
//            }
//        }
//
//        String nameToFind = "Charlie";
//        for (int i = 0; i < names.length; i++){
//            if (names[i].equals(nameToFind)){
//                System.out.println("Age of " + nameToFind + ": " + ages[i]);
//                break;
//            }
//        }
        String[] names = {"John", "Jane", "Bob", "Mary"};
        int[] ages = {25, 20, 30, 22};

        for (int i = 0; i < ages.length - 1; i++){
            for (int j = i + 1; j < ages.length; j++){
                if (ages[i] > ages[j]){

                    int tempAge = ages[i];
                    ages[i] = ages[j];
                    ages[j] = tempAge;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an age to search for: ");
        int searchAge = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < ages.length; i++){
            if (ages[i] == searchAge){
                System.out.println(names[i]);
                found = true;
            }
        }
        if (!found){
            System.out.println("No names found with the age of " + searchAge);
        }
    }
}
