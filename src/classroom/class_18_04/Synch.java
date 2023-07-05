package classroom.class_18_04;

public class Synch {
    private static int counter;

    public static void main(String[] args){
        Runnable runnable = new CounterRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static class CounterRunnable implements Runnable{
        @Override
        public void run(){
            synchronized (CounterRunnable.class){
                counter = 0;
                for (int i = 0; i < 5; i++){
                    counter += 1;
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }
    }
}
