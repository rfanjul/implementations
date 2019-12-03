package gara.implementations;

import junit.framework.TestCase;

public class LinkedListExampleTest extends TestCase {

  public void test(){

    LinkedListExample linkedListExample = new LinkedListExample();

    linkedListExample.insert(3);
    linkedListExample.insert(4);
    linkedListExample.insert(5);


    linkedListExample.print();
  }

}
