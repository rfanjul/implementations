package gara.implementations.threads;

public class ThreadExample extends Thread {
  public static void main(String[] args) {
    System.out.println("Inside : " + Thread.currentThread().getName());

    System.out.println("Creating thread...");
    Thread thread = new ThreadExample();

    System.out.println("Starting thread...");
    thread.start();
  }

  // run() method contains the code that is executed by the thread.
  @Override
  public void run() {
    System.out.println("Inside : " + Thread.currentThread().getName());
  }
}
