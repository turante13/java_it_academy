package practice_17_02;

public class Arrays {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 897;
        arr[1] = 546;
        arr[2] = 678;
        arr[3] = 346;
        arr[4] = 467;

        int minNum = arr[0];

//        for (int i = 0; i < arr.length; i++){
//            if (maxNum <= arr[i]){
//                maxNum = arr[i];
//                maxIndex = i;
//            }
//        }
        for (int i = 0; i < arr.length; i++){
            if (minNum > arr[i]){
                minNum = arr[i];
            }
        }
        System.out.println("Min number is " + minNum);
    }
}
