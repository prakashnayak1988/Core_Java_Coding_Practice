package data_structure.stack;

public class Stack{
    int n;
    int top;
    int[] arr;
    Stack(int n){
        this.n=n;
        this.arr=new int[n];
        this.top=-1;
    }
    public boolean isEmpty(){
        return (top ==-1);
    }
    public boolean isFull(){
        return (n-1==top);
    }
    public void push(int pushedElement){
        if(!isFull()){
            top++;
            arr[top]=pushedElement;
            System.out.println("Element has been pushed successfully :"+pushedElement);
        }else{
            System.out.println("Stack is fulled");
        }
    }

    public void pop(){
        if(!isEmpty()){
            int poppedElement= arr[top];
            System.out.println("Popped Element is -->"+arr[top]);
            top--;
        }else{
            System.out.println("Stack is Empty");
        }
    }
    public void dispalyStack(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        Stack stack=new Stack(100);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.dispalyStack();
        stack.pop();
        stack.push(10);
        stack.pop();
        stack.dispalyStack();
        stack.push(20);
        stack.pop();
        stack.dispalyStack();
        stack.pop();
        stack.push(30);
        stack.dispalyStack();

    }

}