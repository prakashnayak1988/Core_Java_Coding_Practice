package core.java.training.example1;

public class ArithmeticOperations extends Thread{

    int num_1,num_2;
    public ArithmeticOperations(int n1,int n2){
        num_1=n1;
        num_2=n2;
    }
    public void run(){
        System.out.println("Arithmetic Operation Thread");
        System.out.println("Sum -->" +(num_1+num_2));
        System.out.println("Divison -->" +(num_1*num_2));
        System.out.println("Subtration -->" +(num_1-num_2));
        System.out.println("Multplication -->" +(num_1*num_2));
        System.out.println("Power -->" +Math.pow(num_1,num_2));
        System.out.println("End of operation");
    }
}
