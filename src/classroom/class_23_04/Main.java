package classroom.class_23_04;

class Count {
    public static synchronized void method(boolean isOdd, int[] arr) {
        if(isOdd == true) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " Четное число: " + arr[i]);
                }
            }
        }
        else {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " Нечетное число: " + arr[i]);
                }
            }
        }
    }
}
class NewThread extends Thread{
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public boolean isOdd = true; //индикатор для четности или нечентости потока



    public NewThread(boolean isOdd) {
        this.isOdd = isOdd;
    }



    @Override
    public synchronized void run() {
        Count.method(isOdd, arr);
    }



}




public class Main {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread(true); //поток для четных чисел
        NewThread thread2 = new NewThread(false); //поток для нечетных чисел

        thread1.start();
        thread2.start();

    }
}
