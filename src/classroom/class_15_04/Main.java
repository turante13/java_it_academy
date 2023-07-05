package classroom.class_15_04;
class NewThread implements Runnable{
    @Override
    public void run (){
        System.out.println("главный поток");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewThread newThread = new NewThread();
        Thread thread = new Thread(newThread);
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());
        System.out.println(thread.getName());
        thread.start();
        Thread.sleep(5000);
        thread.start();
    }
}

