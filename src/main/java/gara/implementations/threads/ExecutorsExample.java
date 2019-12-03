package gara.implementations.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
  public static void main(String[] args) {


    Runnable task = () -> {
      System.out.println("inside");
    };

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService.submit(task);

    //
    executorService.shutdown();
  }
}
