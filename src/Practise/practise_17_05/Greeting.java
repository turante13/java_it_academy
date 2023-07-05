package Practise.practise_17_05;

import java.util.function.Function;

public class Greeting {
    public static void main(String[] args) {
        String name = "Shovkhal";
        greetByName(name);
    }

    public static void greetByName(String name) {
       As as = n -> System.out.println("Hi " + n );
       as.greet(name);
    }
}
interface As{
    void greet(String name);
}

