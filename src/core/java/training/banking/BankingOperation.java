package core.java.training.banking;

public class BankingOperation {

    public static void main(String[] args){
       Bank bank=new Bank();
       for (int i=0;i<Bank.MAX_ACCOUNT;i++){
           Thread t=new Thread(new Transaction(bank,i));
           t.start();
       }
    }
}
