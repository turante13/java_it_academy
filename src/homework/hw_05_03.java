package homework;

import java.util.Scanner;

public class hw_05_03 {
    public static void main(String[] args){
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter week day: ");
            choice = scanner.nextInt();

        }
        while(choice < 1 && choice > 7);
        System.out.println("\n");
        switch(choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There is no such day of the week");
                break;
        }



//        String monthDate;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter month: ");
//        monthDate = scanner.nextLine();
//        switch(monthDate.toLowerCase()) {
//            case "january":
//                System.out.println("31");
//                break;
//            case "february":
//                System.out.println("28");
//                break;
//            case "march":
//                System.out.println("31");
//                break;
//            case "april":
//                System.out.println("30");
//                break;
//            case "may":
//                System.out.println("31");
//                break;
//            case "june":
//                System.out.println("30");
//                break;
//            case "july":
//                System.out.println("31");
//                break;
//            case "august":
//                System.out.println("31");
//                break;
//            case "september":
//                System.out.println("30");
//                break;
//            case "october":
//                System.out.println("31");
//                break;
//            case "november":
//                System.out.println("30");
//                break;
//            case "december":
//                System.out.println("31");
//                break;
//            default:
//                System.out.println("There is no such month");
//                break;
//        }

//        int points;
//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("Enter your point: ");
//            points = scanner.nextInt();
//
//        }
//        while(points < 1 && points > 5);
//        System.out.println("\n");
//        switch(points) {
//            case 1:
//                System.out.println("Poor");
//                break;
//            case 2:
//                System.out.println("Bad");
//                break;
//            case 3:
//                System.out.println("Not satisfied");
//                break;
//            case 4:
//                System.out.println("Good");
//                break;
//            case 5:
//                System.out.println("Perfect");
//                break;
//            default:
//                System.out.println("There is no such point");
//                break;
//        }
    }
}
