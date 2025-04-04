package data_structure.stack;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


public class StackUsingLinkedList<T> {
    private Node<T> top;
    private int size;

    public StackUsingLinkedList() {
        this.top = null;
        this.size = 0;
    }
    public void push(T data){
        Node<T> newNode =new Node<>(data);
        newNode.next=top;
        top=newNode;
        size++;
    }
    public void pop(){
       if(size==0){
           System.out.println("Stack is Empty");
       }
       T value= top.data;
       top=top.next;
       size--;
       System.out.println("Deleted node is -->"+value);
    }
    public void peek(){
        System.out.println(top.data);
    }
  void printStack(){
      Node<T> temp = top;
      while(temp!=null){
          System.out.print(temp.data +"  ");
          temp=temp.next;
      }
      System.out.println();
  }
  public static void main(String[] args){
      StackUsingLinkedList<Integer> stack = new StackUsingLinkedList();
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.printStack();
      stack.peek();
      stack.pop();
      stack.pop();
      stack.printStack();
  }

}
