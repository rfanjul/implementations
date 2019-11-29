package gara.implementations;

import gara.implementations.HashMapTest;
import junit.framework.TestCase;

public class HashMapTestTest extends TestCase {

  public void test(){
    HashMapTest<String, String> mapTest = new HashMapTest<>(4);

    mapTest.put("one","1");
    mapTest.put("two","2");
    mapTest.put("one","3");

    assertEquals("3", mapTest.get("one"));
  }

}
