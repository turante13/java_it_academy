package classroom.class_27_04;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) throws
            IOException {
        File inputFile = new File("image2.jpg");
        InputStream inputStream = new FileInputStream(inputFile);

        File outPutFile = new File("image2_copy.jpg");
        OutputStream outputStream = new FileOutputStream(outPutFile);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1){
            outputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outputStream.close();

        System.out.println("Photo is successfully uploaded!");
    }
}
