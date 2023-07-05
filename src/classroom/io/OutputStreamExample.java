package classroom.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args){
        try{
            OutputStream output = new FileOutputStream("file.txt");
            String data = "Hello, world!";
            output.write(data.getBytes());
            output.close();
        } catch(IOException e){
            System.out.println("Error input-output: " + e.getMessage());
        }
    }
}
