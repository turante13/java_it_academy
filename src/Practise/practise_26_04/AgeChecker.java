package Practise.practise_26_04;

import java.util.Scanner;

//public class AgeChecker {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int age;
//
//        System.out.print("What would you like to buy? (alcohol/energy drink/cigarettes) ");
//        String item = input.nextLine();
//
//        switch (item) {
//            case "alcohol":
//                System.out.print("How old are you? ");
//                age = input.nextInt();
//                if (age >= 18) {
//                    System.out.println("You may purchase alcohol.");
//                } else {
//                    System.out.println("Sorry, you are not old enough to purchase alcohol.");
//                }
//                break;
//
//            case "energy drink":
//                System.out.print("How old are you? ");
//                age = input.nextInt();
//                if (age >= 18) {
//                    System.out.println("You may purchase an energy drink.");
//                } else {
//                    System.out.println("Sorry, you are not old enough to purchase an energy drink.");
//                }
//                break;
//
//            case "cigarettes":
//                System.out.print("How old are you? ");
//                age = input.nextInt();
//                if (age >= 18) {
//                    System.out.println("You may purchase cigarettes.");
//                } else {
//                    System.out.println("Sorry, you are not old enough to purchase cigarettes.");
//                }
//                break;
//
//            default:
//                System.out.println("Sorry, we do not sell that item here.");
//                break;
//        }
//    }
//}

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        double totalPrice = 0;

        System.out.println("Welcome to our store!");
        while (true) {
            System.out.print("What would you like to buy? (alcohol/energy drink/cigarettes) ");
            String item = input.nextLine();

            switch (item) {
                case "alcohol":
                    System.out.print("How old are you? ");
                    age = input.nextInt();
                    if (age >= 18) {
                        System.out.println("You may purchase alcohol for $10.");
                        totalPrice += 10;
                    } else {
                        System.out.println("Sorry, you are not old enough to purchase alcohol.");
                    }
                    input.nextLine(); // consume the remaining newline character
                    break;

                case "energy drink":
                    System.out.print("How old are you? ");
                    age = input.nextInt();
                    if (age >= 16) {
                        System.out.println("You may purchase an energy drink for $2.");
                        totalPrice += 2;
                    } else {
                        System.out.println("Sorry, you are not old enough to purchase an energy drink.");
                    }
                    input.nextLine(); // consume the remaining newline character
                    break;

                case "cigarettes":
                    System.out.print("How old are you? ");
                    age = input.nextInt();
                    if (age >= 18) {
                        System.out.println("You may purchase cigarettes for $8.");
                        totalPrice += 8;
                    } else {
                        System.out.println("Sorry, you are not old enough to purchase cigarettes.");
                    }
                    input.nextLine(); // consume the remaining newline character
                    break;

                case "done":
                    System.out.println("Thank you for shopping with us! Your total is $" + totalPrice + ".");
                    return;

                default:
                    System.out.println("Sorry, we do not sell that item here.");
                    break;
            }
        }
    }
}


