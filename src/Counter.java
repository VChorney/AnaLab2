import static java.lang.Thread.sleep;

class Counter {

  private int c = 0;
  private Object lock1 = new Object();
  private Object lock2 = new Object();

  public void increment() throws InterruptedException {
    synchronized (lock1){
      int a;
      a = c;
      a++;
      c = a;
    }
  }

  public void decrement() throws InterruptedException {
    synchronized (lock2){
      int a;
      a = c;
      a--;
      c = a;
    }
  }

  public int value() {
    return c;
  }
}