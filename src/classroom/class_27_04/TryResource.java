package classroom.class_27_04;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryResource {
    public static void main(String[] args) {
        try{
            Reader ignored = new FileReader("file.txt");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
