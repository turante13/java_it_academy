package classroom.lesson_5;

public class test {
    public static void main(String[] args) {
        int arr [] = {1, 4, 6, 76, 89, 12, 90, 87, 3, 120};
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);

    }
}
