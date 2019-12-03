import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FuturesExample {

  public static void main(String args[]) throws ExecutionException, InterruptedException {

    Callable<Integer> task = () -> {
      try {
        TimeUnit.SECONDS.sleep(3);
        return 123;
      }
      catch (InterruptedException e) {
        throw new IllegalStateException("task interrupted", e);
      }
    };


    Callable<String> taskString = new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "hola";
      }
    };

    ExecutorService executor = Executors.newFixedThreadPool(1);
    Future<Integer> futureInteger = executor.submit(task);
    FuturesExample.print(futureInteger);

    Future<String> futureString = executor.submit(taskString);
    FuturesExample.print(futureString);
  }

  private static void print(Future future){
    try {
      System.out.println("future done? " + future.isDone());
      System.out.println("future done? " + future.isDone());
      System.out.print("result: " + future.get());
    }catch (ExecutionException | InterruptedException e){

    }
  }

}
