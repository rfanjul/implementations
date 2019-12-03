package gara.implementations.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableExample {
  public static void main(String[] args) throws ExecutionException, InterruptedException {

    Callable<String> stringCallable = () -> {
        TimeUnit.SECONDS.sleep(4);
        return "stringCallable";
    };

    ExecutorService executorService = Executors.newFixedThreadPool(1);
    Future<String> future = executorService.submit(stringCallable);

    System.out.println("Start to wait.");
    System.out.println(future.get());

    System.out.println("hola I wait 5 s");
    executorService.shutdown();
  }
}
