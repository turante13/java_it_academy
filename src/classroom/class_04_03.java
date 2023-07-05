package classroom;

public class class_04_03 {
    public static void main(String[] args){
//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int i = 0; i < 10; i++){
//            sum += nums[i];
//        }
//
//        for (int x : nums){
//            System.out.println("Значение равно: " + x);
//            sum += x;
//            if (x == 8) break;
//        }

        String[][] words = {
                {"hello", "world"},
                {"open", "ai"},
                {"chat", "gpt"}
        };

//        for (int i = 0; i < words.length; i++){
//            for (int j = 0; j < words[i].length; j++){
//                System.out.print(words[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (String[] row : words){
            for (String s : row){
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
