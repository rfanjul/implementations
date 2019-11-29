package gara.implementations;

import gara.implementations.LinkedList;
import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

  public void test(){

    LinkedList linkedList = new LinkedList();

    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);


    linkedList.print();
  }

}
