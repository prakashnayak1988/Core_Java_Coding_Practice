package data_structure.stack;

import java.util.ArrayList;

public class StackUsingArrayList<T> {

    private final ArrayList<T> stack ;

    public StackUsingArrayList() {
        stack=new ArrayList<>();
    }

    public void push(T value){
        stack.add(value);
        System.out.println("Element added ::"+value);
    }
    public T pop(){
        if(stack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        System.out.println("Removed Element ::"+ stack.get(stack.size()-1));
      return  stack.remove(stack.size() - 1);
    }
    public T peek(){
        if(stack.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
       return stack.get(stack.size()-1);
    }
    public void printStack(){
        System.out.println("Stack printing"+stack);
    }
    public static void main(String[] args){
        StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.peek();
    }

}
