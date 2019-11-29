package gara.implementations;

public class LinkedList {

  Node head;

  static class Node{
    Node next;
    int data;

    public Node(final int data) {
      this.data = data;
    }
  }

  public LinkedList insert(int data){

    if ( head == null ) {
      head = new Node(data);
    }else{

      Node last = head;
      while(last.next != null ) last = last.next;

      last.next = new Node(data);
    }

    return this;
  }

  public void print(){
    Node last = head;
    while (last.next != null ) {
      System.out.println(last.data);
      last = last.next;
    }

    System.out.println(last.data);
  }
}


