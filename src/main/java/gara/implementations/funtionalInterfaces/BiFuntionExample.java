package gara.implementations.funtionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFuntionExample {
  public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<>();
    map.put(1, "A");
    map.put(2, "B");
    map.put(3, "C");

    BiFunction<Integer,String,Integer> function = (i,s) ->{
        return i+1;
    };


    System.out.println(function.apply(2,"s"));
  }
}
