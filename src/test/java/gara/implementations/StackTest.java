package gara.implementations;

import gara.implementations.Stack;
import junit.framework.TestCase;

public class StackTest extends TestCase {

  public void test(){

    Stack stack = new Stack(4);

    stack.push(3);
    stack.push(4);
    stack.push(5);

    assertEquals(3,stack.size());
    assertEquals(5,stack.pop());
    assertEquals(2,stack.size());
    assertEquals(4,stack.pop());
    assertEquals(1,stack.size());
  }
}
