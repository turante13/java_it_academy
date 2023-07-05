package homework.hw_25_04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageDownloader {

    private static final String IMAGE_URL = "https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/Y7Y35DAEXZEVFDFXU5Y42CJ4KQ.jpg&w=691";
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) throws Exception {
        URL url = new URL(IMAGE_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");
        int fileSize = connection.getContentLength();
        connection.disconnect();

        int chunkSize = fileSize / NUM_THREADS;
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize - 1;
            if (i == NUM_THREADS - 1) {
                end = fileSize - 1;
            }
            executorService.execute(new DownloadTask(start, end));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.sleep(1000);
        }
        mergeChunks();
    }

    private static class DownloadTask implements Runnable {
        private final int start;
        private final int end;

        DownloadTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void run() {
            try {
                URL url = new URL(IMAGE_URL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestProperty("Range", "bytes=" + start + "-" + end);
                InputStream inputStream = connection.getInputStream();
                FileOutputStream outputStream = new FileOutputStream("image.part" + start / (end - start + 1));
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                inputStream.close();
                outputStream.close();
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void mergeChunks() throws Exception {
        FileOutputStream outputStream = new FileOutputStream("image.jpg");
        for (int i = 0; i < NUM_THREADS; i++) {
            FileInputStream inputStream = new FileInputStream("image.part" + i);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            inputStream.close();
            new File("image.part" + i).delete();
        }
        outputStream.close();
    }
}
