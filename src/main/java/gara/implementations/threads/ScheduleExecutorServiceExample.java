import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorServiceExample {
  public static void main(String args[]) throws InterruptedException {

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

    Runnable task = () -> {
      System.out.println("\nhola " + System.nanoTime());
    };

    ScheduledFuture<?> future = executor.scheduleAtFixedRate(task, 3, 2, TimeUnit.SECONDS);

    TimeUnit.MILLISECONDS.sleep(2000);

    long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
    System.out.printf("\nRemaining Delay: %sms", remainingDelay);
  }
}
