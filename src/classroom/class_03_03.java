package classroom;
import java.util.Scanner;

public class class_03_03 {
    public static void main(String[] args){
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Choose district: ");
            System.out.println("    1. Lenin");
            System.out.println("    2. Pervomai");
            System.out.println("    3. October");
            System.out.println("    4. Sverdlov");
            System.out.println("");
            System.out.println("Choose: ");
            choice = scanner.nextInt();

        }
        while(choice < 1);
        System.out.println("\n");
        switch(choice) {
            case 1:
                System.out.println("Lenin district selected");
                break;
            case 2:
                System.out.println("Pervomai district selected");
                break;
            case 3:
                System.out.println("October district selected");
                break;
            case 4:
                System.out.println("Sverdlov district selected");
                break;
            default:
                System.out.println("There is no such district");
                break;
        }
    }
}
