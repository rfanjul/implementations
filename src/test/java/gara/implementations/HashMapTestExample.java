package gara.implementations;

import junit.framework.TestCase;

public class HashMapTestExample extends TestCase {

  public void test(){
    HashMapExample<String, String> mapTest = new HashMapExample<>(4);

    mapTest.put("one","1");
    mapTest.put("two","2");
    mapTest.put("one","3");

    assertEquals("3", mapTest.get("one"));
  }

}
