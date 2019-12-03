import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutdownNowThreadExample {

  public static void main(String agrs[]) {

    Runnable task = () -> {
      String threadName = Thread.currentThread().getName();
      System.out.print("\nHello " + threadName);
    };

    task.run();

    Thread thread = new Thread(task);
    thread.setName("with start");
    thread.start();

    System.out.print("\nDone!");

    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
      String threadName = Thread.currentThread().getName();
      System.out.println("\nHello " + threadName);

      try {
        System.out.println("attempt to shutdown executor");
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
      } catch (InterruptedException e) {
        System.err.println("tasks interrupted");
      } finally {
        if (!executor.isTerminated()) {
          System.err.println("cancel non-finished tasks");
        }
        executor.shutdownNow();
        System.out.println("shutdown finished");
      }
    });

  }
}
