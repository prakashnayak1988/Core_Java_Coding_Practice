package core.java.training.example1;

public class TriginometricOperation extends Thread{
    int num;
    public TriginometricOperation(int n){
        num=n;
    }
    public void run(){
        System.out.println("Trigonomeric opertaion Thread");
        System.out.println("SINE OF "+num  +" "+Math.sin(num));
        System.out.println("COSINE OF "+num  +" "+Math.cos(num));
        System.out.println("Tan OF "+num  +" "+Math.tan(num));
        System.out.println("SINE OF "+num  +" "+Math.sin(num));


    }
}
