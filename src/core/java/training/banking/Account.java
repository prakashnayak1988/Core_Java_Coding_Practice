package core.java.training.banking;

public class Account {
    private  int balance=0;
    public Account(int balance){
       this.balance=balance;
   }
   public void withdraw(int amount){
        this.balance=this.balance-amount;
   }
    public void deposit(int amount){
        this.balance=this.balance+amount;
    }
    public int getBalance(){
        return this.balance;
    }
}
