package gara.implementations;

public class Queue {

  int[] arr;
  int front = -1;
  int rear = 0;

  public Queue(final int size) {
    arr = new int[size];
  }

  public void enqueue(final int i){
    arr[++front] = i;
  }

  public int dequeue(){
    return arr[rear++];
  }
}
