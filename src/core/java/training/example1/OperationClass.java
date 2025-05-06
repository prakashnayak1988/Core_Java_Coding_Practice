package core.java.training.example1;

import java.util.Scanner;

public class OperationClass {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for Arithmetic operations");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Enter one values for trigonometric operations");
        int n=sc.nextInt();
        ArithmeticOperations ao=new ArithmeticOperations(n1,n2);
        TriginometricOperation to=new TriginometricOperation(n);

        ao.start();
        to.start();
    }
}
