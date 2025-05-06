package core.java.training.datastructure.custom_datastructure;

import java.util.Arrays;

public class CustomArray {
    private int[] data;
    private int size;          // number of elements in the array
    private int capacity;      // length of the internal array

    // Constructor
    public CustomArray() {
        capacity = 3;         // default capacity
        data = new int[capacity];
        size = 0;
    }

    // Add element to the end
    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        data[size++] = value;
    }
    public void insert(int index, int value) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Invalid index");
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1]; // Shift right
        }
        data[index] = value;
        size++;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        return data[index];
    }

    // Remove element at index
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];  // Shift elements left
        }
        size--;
    }

    // Resize internal array when full
    private void resize() {
        capacity = capacity * 2;
        int[] newData = new int[capacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
    private void ensureCapacity() {
        if (size == capacity) {
            capacity = capacity * 2;
            int[] newData = new int[capacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) return true;
        }
        return false;
    }

    // Return current size
    public int size() {
        return size;
    }

    // Return current capacity
    public int capacity() {
        return capacity;
    }

    // Display all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public int indexOf(int value){
        for(int i=0;i<data.length;i++)
            if (data[i] == value)
                return i;
       return -1;
    }
    public void sort(){
        Arrays.sort(data,0,size);
        print();
    }
}

