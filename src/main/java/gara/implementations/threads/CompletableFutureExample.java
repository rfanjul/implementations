package gara.implementations.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureExample {
  public static void main(String[] args) throws InterruptedException, ExecutionException {

    CompletableFuture<String> f = CompletableFutureExample.calculateAsync();

    CompletableFuture<String> t = f.thenApply((a)-> "then-> " + a );

    System.out.println(f.get());

    System.out.println(t.get());

  }

  public static CompletableFuture<String> calculateAsync() throws InterruptedException {
    CompletableFuture<String> completableFuture = new CompletableFuture<>();

    Executors.newCachedThreadPool().submit(() -> {
      Thread.sleep(500);
      completableFuture.completeAsync(() -> "Hello");
      return null;
    });

    return completableFuture;
  }
}
