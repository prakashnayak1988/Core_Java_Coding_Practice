package core.java.training.banking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    public static final int MAX_ACCOUNT=10;
    public static final int MAX_AMOUNT=10;
    public static final int INITIAL_BALANCE=10;

    private Account[] accounts= new Account[MAX_ACCOUNT];
    private Lock banklLock;
    public Bank(){
        for(int i=0;i< accounts.length;i++){
            accounts[i]=new Account(INITIAL_BALANCE);
        }
        banklLock=new ReentrantLock();

    }
    public int getTotalBalance(){
        int total =0;
        for(int i=0;i< accounts.length;i++){
            total+=accounts[i].getBalance();
        }
        return total;
    }
    public void transfer(int from, int to, int amount){
       banklLock.lock();
       try{
        if(amount<=accounts[from].getBalance()){
            accounts[from].withdraw(amount);
            accounts[to].deposit(amount);
            String message =String.format("Thread Name is -- %s - Amount  %s transferred  from %s to %s . Total balance : %d",Thread.currentThread().getName(), amount,from, to ,getTotalBalance());
            // String updated_balance="updated balance from account %d  to account %d ";
            String updated_balance=String.format("  updated balance from account %d  to account %d ",accounts[from].getBalance(), accounts[to].getBalance());

           System.out.println(message +updated_balance);
           //System.out.println(updated_balance);
            for (Account account : accounts) {
                System.out.print(account.getBalance()+" ");
            }
            System.out.println();
        }
       }finally {
           banklLock.unlock();
       }
    }



}
