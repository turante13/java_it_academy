package classroom.class_27_04;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\UserName\\Documents\\newfile.txt";

        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}

