package gara.implementations.algorithms.sort;

public class Insertion {

  // 3 4 1
  static int[] insertionSort(int arr[]) {
    int i, j, key;
    for (i = 1; i < arr.length; i++) {
      j = i;

      // j=1
      //
      while (j > 0 && arr[j - 1] > arr[j]) {
        key = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = key;
        j--;
      }
    }
    return arr;
  }
}
