package Practise.practise_10_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing thread: " + e.getMessage());
                }
            }
        }
    }
}
