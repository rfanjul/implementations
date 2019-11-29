package gara.implementations.algorithms.sort;

import gara.implementations.algorithms.sort.Insertion;
import junit.framework.TestCase;
import org.junit.Test;

public class InsertionTest extends TestCase {

  @Test
  public void test(){
    int[] array = {5, 1, 6, 2, 4, 3};
    // calling insertion sort function to sort the array

    int[] result = Insertion.insertionSort(array);
    int[] expectedResult = new int[]{1,2,3,4,5,6};

    for(int i=0 ;i < expectedResult.length;i++){
        assertEquals(expectedResult[i],result[i]);
    }
  }
}
