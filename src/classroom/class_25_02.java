package classroom;

public class class_25_02 {
    public static void main(String[] args){


        int[] arr = {1, 23, 31, 42, 59, 61, 79, 86, 97, 120};
        System.out.println(binarySearch(arr, 97));

    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;


        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
}
