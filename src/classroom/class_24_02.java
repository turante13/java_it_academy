package classroom;
public class class_24_02 {
    public static void main(String[] args){
        int[] num = {1, 2, 3, 4, 5, 6, 7};

        /*System.out.println("Odd Numbers:");
        for (int i = 0; i < num.length; i++){
            if(num[i] % 2 != 0){
                System.out.println(num[i]);
            }
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.println(num[i]);
            }
        }*/

        int max = num[0];
        int secondMax = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i] < max){
                max = num[i];}
            else if (num[i] < secondMax){
                secondMax = num[i];}

        }
        //System.out.println("Second Max: " + secondMax);
        System.out.println("Second max: " + secondMax);
    }
}

