package classroom.class_25_05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void sortStudents(List<String> students){
        students.sort(Comparator.comparing(String::length));
    }

    public static void main(String[] args){
        List<String> students = Arrays.asList("Bob", "Patrick", "Kenya", "Altuha");
        sortStudents(students);
        System.out.println(students);
    }
}

