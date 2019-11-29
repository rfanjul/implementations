package gara.implementations;

public class Stack {

  int[] arr;
  int top = -1;
  int capacity;

  public Stack(final int capacity) {
    this.arr = new int[capacity];
    this.capacity = capacity;
  }

  boolean isEmpty(){
    return this.top == -1;
  }

  boolean isFull(){
    return size() == capacity;
  }

  int size(){
    return this.top + 1;
  }

  void push(final int num){
    arr[++top] = num;
  }

  int pop(){
    return arr[top--];
  }
}

