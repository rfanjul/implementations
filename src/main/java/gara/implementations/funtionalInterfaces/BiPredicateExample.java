package gara.implementations.funtionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

  public static void main(String[] args) {
    BiPredicate<Integer,String> biPredicate = (i,s) ->{

      if ( i < 5 ){
        return true;
      }

      return false;
    };


    System.out.println( biPredicate.test(4,"true"));

    System.out.println( biPredicate.test(7,"false"));
  }
}
