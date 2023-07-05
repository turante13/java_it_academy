package classroom.class_23_04_practise;

class Calc {
    public int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
    public synchronized void calculateNechet() throws InterruptedException {
        for (int i = 0; i < numbers.length; i += 2) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Odd: " + numbers[i]);
                notifyAll();
            } else {
                wait();
                i -= 2;
            }
        }
    }
    public synchronized void calculateChet() throws InterruptedException {
        for (int i = 0; i < numbers.length; i += 2) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Even: " + numbers[i]);
                notifyAll();
            } else {
                wait();
                i -= 2;
            }
        }
    }
}
class A extends Thread {
    Calc calc;
    public A(Calc calc) {
        this.calc = calc;
    }
    @Override
    public void run() {
        try {
            calc.calculateNechet();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class B extends Thread {
    Calc calc;
    public B(Calc calc) {
        this.calc = calc;
    }
    @Override
    public void run() {
        try {
            calc.calculateChet();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        A threadA = new A(calc);
        B threadB = new B(calc);
        threadA.start();
        threadB.start();
    }
}
