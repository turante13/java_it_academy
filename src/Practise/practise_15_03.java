package Practise;

public class practise_15_03 {
    public static void main(String[] args){
        System.out.println(getEven(19));
        System.out.println(getSquare(5));
        System.out.println(getSquare(7));
        System.out.println(getTime(25));
    }
    public static String getEven(int a){
        if (a % 2 == 0){
            return "even";
        } else{
            return "odd";
        }
    }
    public static int getSquare(int b){
        int result = b * b;
        return result;
    }

    public static String getTime(int c){
        if (c >= 0 && c <= 4){
            return "night";
        } if (c >= 5 && c <= 11){
            return "morning";
        } if (c >= 12 && c <= 17){
            return "noon";
        } if (c >= 18 && c <= 24) {
            return "evening";
        } else {
            return "no such time";
        }
    }

}
