package classroom;
import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class class_28_02 {
    public static void main(String[] args){
//        int month = 4;
//        String season;
//
//        if (month == 12 || month == 1 || month == 2)
//            season = "Зиме";
//        else if (month == 3 || month == 4 || month == 5)
//            season = "Весне";
//        else if (month == 6 || month == 7 || month == 8)
//            season = "Лету";
//        else if (month == 9 || month == 10 || month == 11)
//            season = "Осени";
//        else
//            season = "Вымышленным месяцам";
//        System.out.println("Апрель относится к " + season + ".");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the temperature in Celsius: ");
//        double temperature = scanner.nextDouble();
//        if (temperature < 0){
//            System.out.println("Cold outside");
//        } else if (temperature < 20){
//            System.out.println("Today is warm outside");
//        } else if (temperature < 30){
//            System.out.println("Today is perfect weather");
//        } else {
//            System.out.println("Today is hot!");
//        }

//        for (int i = 0; i < 6; i++)
//            switch (i) {
//                case 0:
//                    System.out.println("i equals to null");
//                    break;
//                case 1:
//                    System.out.println("i equals to null");
//                    break;
//                case 2:
//                    System.out.println("i equals to null");
//                    break;
//                case 3:
//                    System.out.println("i equals to null");
//                    break;
//                default:
//                    System.out.println("DONE");
//            }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a day of the week:");
//        String dayOfWeek = sc.nextLine();
//
//        switch (dayOfWeek.toLowerCase()){
//            case "monday":
//                System.out.println("This is Monday. Time to start working week");
//                break;
//            case "tuesday":
//                System.out.println("This is Tuesday. Keep working");
//                break;
//            case "wednesday":
//                System.out.println("This is Wednesday. Time to start working week");
//                break;
//            case "thursday":
//                System.out.println("This is Thursday. Time to start working week");
//                break;
//            case "friday":
//                System.out.println("This is Friday. Time to celebrate end of the week");
//                break;
//            case "saturday":
//            case "sunday":
//                System.out.println("It's weekend! Time to relax and chill");
//                break;
//            default:
//                System.out.println("Wrong day of the week");
//
//        }


        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int choice;

        do {
            System.out.println("Choose:");
            System.out.println("1. Enter variables ");
            System.out.println("2. Show variables");
            System.out.println("3. Find sum of variables");
            System.out.println("4. Find average of variables");
            System.out.println("5. Exit");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter 5 variables");
                    for (int i = 0; i < 5; i++){
                        numbers[i] = input.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Description of variables");
                    for (int i = 0; i < 5; i++){
                        System.out.println(numbers[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < 5; i++){
                        sum += numbers[i];
                    }
                    System.out.println("Total of variables: " + sum);
                    break;
                case 4:
                    int total = 0;
                    for (int i = 0; i < 5; i++){
                        total += numbers[i];
                    }
                    double average = total / 5.0;
                    System.out.println("Average of variables: " + average);
                    break;
                case 5:
                    System.out.println("Exit program...");
                    break;
                default:
                    System.out.println("Wrong choice! Please try again.");
            }
        } while (choice != 5);
    }
}
