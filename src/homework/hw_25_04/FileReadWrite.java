package homework.hw_25_04;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        String sourceFilePath = "sourceFile.txt";
        String targetFilePath = "targetFile.txt";

        // Start the reading thread
        new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Read: " + line);
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath, true))) {
                        writer.write(line);
                        writer.newLine();
                    }
                    System.out.println("Wrote: " + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

