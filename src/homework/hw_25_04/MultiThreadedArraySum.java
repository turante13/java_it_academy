package homework.hw_25_04;

public class MultiThreadedArraySum {

    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chunkSize = arr.length / NUM_THREADS;
        int startIndex, endIndex, sum = 0;

        Thread[] threads = new Thread[NUM_THREADS];
        ArraySumTask[] tasks = new ArraySumTask[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            startIndex = i * chunkSize;
            endIndex = (i == NUM_THREADS - 1) ? arr.length : (i + 1) * chunkSize;
            tasks[i] = new ArraySumTask(arr, startIndex, endIndex);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < NUM_THREADS; i++) {
            sum += tasks[i].getSum();
        }

        System.out.println("Array Sum: " + sum);
    }

    private static class ArraySumTask implements Runnable {
        private final int[] arr;
        private final int startIndex;
        private final int endIndex;
        private int sum;

        ArraySumTask(int[] arr, int startIndex, int endIndex) {
            this.arr = arr;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                sum += arr[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }
}
