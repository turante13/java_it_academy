package classroom;

public class class_01_03 {
    public static void main(String[] args){
        int[][] arr = {
                {11, 2, 3},
                {4, 50, 6},
                {7, 8, 9}
        };

        int max = 0;
        int sum = 0;
        int min = arr[0][0];
        int total = 0;
        double average = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                } else if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
                counter += 1;
            }
        }
        average = total / counter;
        System.out.println(max);
        System.out.println(min);
        System.out.println(total);
        System.out.println(average);
    }
}
