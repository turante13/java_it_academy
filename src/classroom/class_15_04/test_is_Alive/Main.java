package classroom.class_15_04.test_is_Alive;

public class Main implements Runnable{
    public void run (){
        System.out.println("Thread launched");
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread launched");
    }

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new Main());
        thread.start();
        System.out.println("Main Thread waiting end of Children Thread");
        while (thread.isAlive()){
            System.out.println("Children Thread is launched");
            Thread.sleep(1000);
        }
        System.out.println("Children Thread finished");
        thread.join();
        System.out.println("Main Thread finished");
    }
}