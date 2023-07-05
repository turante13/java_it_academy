package Practise.practise_17_03;

public class BankAccount {
    double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }


    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void transfer(BankAccount toAccount, double amount){
        withdraw(amount);
        toAccount.deposit(amount);
    }
}
