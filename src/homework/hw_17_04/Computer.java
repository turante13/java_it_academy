package homework.hw_17_04;

public class Computer {
    public void connectAll(Connectable[] devices){
        for (Connectable device : devices){
            device.connect();
        }
    }
}

interface Connectable{
    void connect();
}

class Printer implements Connectable{
    public void connect(){
        System.out.println("Printer is connected.");
    }
}

class Scanner implements Connectable{
    public void connect(){
        System.out.println("Scanner is connected.");
    }
}

class Launch{
    public static void main(String[] args){
        Printer printer1 = new Printer();
        Scanner scanner1 = new Scanner();
        Computer computer1 = new Computer();
        Connectable[] devices = {printer1, scanner1};
        computer1.connectAll(devices);
    }
}




