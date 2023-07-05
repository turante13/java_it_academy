package homework.hw_17_04;

abstract class BankAccount{
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class CheckingAccount extends Banking{
    double balance;
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        balance -= amount;
    }
}

class SavingsAccount extends Banking implements InterestEarning{
    double balance;
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        balance -= amount;
    }
    public double calculateInterest(){
        return balance * 0.05;
    }
}

interface InterestEarning{
    double calculateInterest();
}

public class Banking {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();

        checkingAccount.deposit(7500);
        checkingAccount.withdraw(2900);
        System.out.println("Checking Account balance: " + checkingAccount.balance);

        savingsAccount.deposit(17000);
        double interest = savingsAccount.calculateInterest();
        savingsAccount.deposit(interest);
        System.out.println("Savings Account balance: " + savingsAccount.balance);
    }
}
