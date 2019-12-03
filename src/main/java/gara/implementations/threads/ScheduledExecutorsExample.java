package gara.implementations.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {

  public static void main(String[] args) {

    Runnable task = () -> {
      System.out.println(Thread.currentThread().getName());
    };

    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

    executorService.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
  }
}
