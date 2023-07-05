package Practise.practise_31_03;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        int words = sentence.split(" ").length;
        int characters = sentence.length();
        int vowels = countVowels(sentence);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
        System.out.println("Vowels: " + vowels);
    }

    public static int countVowels(String str){
        int count = 0;
        String vowels = "aeiouyAEIOUY";
        for (int i = 0; i < str.length(); i++){
            if (vowels.indexOf(str.charAt(i)) != -1){
                count++;
            }
        }
        return count;
    }
}
