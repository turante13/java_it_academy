package Practise.practise_19_04;

class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        while (count >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("Increment counter: " + count);
        notify();
    }

    public synchronized void decrement() {
        while (count <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count-- ;
        System.out.println("Decrement counter: " + count);
        notify();
    }
}

class MyThreadOne extends Thread{
    private SharedResource resource;

    public MyThreadOne(SharedResource resource){
        this.resource = resource;
    }

    public void run(){
        resource.increment();
        resource.decrement();
    }
}

class Main{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThreadOne thread1 = new MyThreadOne(resource);
        MyThreadOne thread2 = new MyThreadOne(resource);
        thread1.start();
        thread2.start();
    }
}
