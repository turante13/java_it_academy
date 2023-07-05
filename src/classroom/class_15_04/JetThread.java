package classroom.class_15_04;


import java.util.Scanner;

class Thread1 extends Thread{
    int n;
    public Thread1(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Thread number: " + n + " started");
    }
}

class As{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thread amount: ");
        int number = scanner.nextInt();
        Thread[] newThread = new Thread[number];
        for (int i = 0; i < number; i++){
            newThread[i] = new Thread1(i + 1);
            newThread[i].start();
        }
    }
}
