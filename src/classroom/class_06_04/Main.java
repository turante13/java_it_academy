package classroom.class_06_04;

public interface Main {
    public void getMoney();
}

class ATM implements Main{
    @Override
    public void getMoney(){
        System.out.println("CASH$");

    }
}

class Pyramid{
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getMoney();
    }
}