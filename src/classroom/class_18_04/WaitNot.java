package classroom.class_18_04;

public class WaitNot {
    public static void main(String[] args) {
        BlockQueue queue = new BlockQueue();
        Runnable workerTask = new WorkerTask(queue);
        Thread worker = new Thread(workerTask);
        worker.start();
        for (int i = 0; i < 10; i++) {
            Runnable task = getTask();
            queue.put(task);
        }
    }
    public static Runnable getTask() {
        return new Task();
    }
    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Поток запущен: " + this);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток завершен: " + this);
        }
    }
    static class WorkerTask implements Runnable {
        private BlockQueue queue;
        public WorkerTask(BlockQueue queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            while (true) {
                Runnable task = queue.get();
                task.run();
            }
        }
    }
    static class BlockQueue {
        private Runnable[] tasks = new Runnable[10];
        private int size = 0;
        public synchronized Runnable get() {
            while (size == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Runnable task = tasks[0];
            System.arraycopy(tasks, 1, tasks, 0, size - 1);
            size--;
            return task;
        }
        public synchronized void put(Runnable task) {
            tasks[size] = task;
            size++;
            notify();
        }
    }
}
