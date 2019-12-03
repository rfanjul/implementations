package gara.implementations;

import junit.framework.TestCase;

public class QueueExampleTest extends TestCase {

  public void test(){

    QueueExample queueExample = new QueueExample(4);

    queueExample.enqueue(3);
    queueExample.enqueue(4);
    queueExample.enqueue(5);

   // assertEquals(3, queue.size());
    assertEquals(3, queueExample.dequeue());
    //assertEquals(2,queue.size());
    assertEquals(4, queueExample.dequeue());
    //assertEquals(1,queue.size());
  }
}
