package gara.implementations.algorithms.sort;

import gara.implementations.algorithms.sort.Quick;
import junit.framework.TestCase;
import org.junit.Test;

public class QuickTest extends TestCase {

  @Test
  public void test(){

    int[] array = {5, 1, 6, 2, 4, 3};

    // call quickSort function
    Quick quickSort = new Quick();
    quickSort.quicksort(array, 0, array.length-1);
  }

}
