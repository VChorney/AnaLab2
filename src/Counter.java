import static java.lang.Thread.sleep;

class Counter {

  private int c = 0;

  public synchronized void increment() throws InterruptedException {
    int a;
    sleep(150);
    a = c;
    a++;
    c = a;
  }

  public void decrement() throws InterruptedException {
    int a;

    sleep(100);
    a = c;
    a--;
    c = a;
  }

  public int value() {
    return c;
  }
}