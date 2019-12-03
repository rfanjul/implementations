package gara.implementations.threads;

public class VolatileExample extends Thread {

  private static int count = 0;

  public void increamentCount() {
    count++;
  }
  public int getCount() {
    return count;
  }

  @Override
  public void run() {
    this.increamentCount();
  }

  public static void main(String[] args) {

    for(int i =0;i< 40 ; i++ ){
      Thread t1 = new VolatileExample();
      t1.start();
    }

    try {
      System.out.println("count " + VolatileExample.count);
    }
    catch(Exception e) {
      e.printStackTrace();
    }

  }
}
