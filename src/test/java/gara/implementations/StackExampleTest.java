package gara.implementations;

import junit.framework.TestCase;

public class StackExampleTest extends TestCase {

  public void test(){

    StackExample stackExample = new StackExample(4);

    stackExample.push(3);
    stackExample.push(4);
    stackExample.push(5);

    assertEquals(3, stackExample.size());
    assertEquals(5, stackExample.pop());
    assertEquals(2, stackExample.size());
    assertEquals(4, stackExample.pop());
    assertEquals(1, stackExample.size());
  }
}
