package gara.implementations;

import gara.implementations.Queue;
import junit.framework.TestCase;

public class QueueTest extends TestCase {

  public void test(){

    Queue queue = new Queue(4);

    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

   // assertEquals(3, queue.size());
    assertEquals(3,queue.dequeue());
    //assertEquals(2,queue.size());
    assertEquals(4,queue.dequeue());
    //assertEquals(1,queue.size());
  }
}
