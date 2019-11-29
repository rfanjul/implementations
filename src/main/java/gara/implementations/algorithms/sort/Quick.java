package gara.implementations.algorithms.sort;

public class Quick {

  void quicksort(int array[], int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(array, begin, end);
      quicksort(array, begin, partitionIndex);
      quicksort(array, partitionIndex + 1, end);
    }
  }

  private int partition(int array[], int begin, int end) {
    int pivot = array[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (array[j] <= pivot) {
        i++;

        int swapTemp = array[i];
        array[i] = array[j];
        array[j] = swapTemp;
      }
    }

    int swapTemp = array[i + 1];
    array[i + 1] = array[end];
    array[end] = swapTemp;

    return i + 1;
  }

}
