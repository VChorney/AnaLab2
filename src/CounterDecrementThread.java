public class CounterDecrementThread extends Thread {

  private final Counter counter;

  public CounterDecrementThread(Counter counter) {
    this.counter = counter;
  }

  public void run() {
    try {
      counter.decrement();
      System.out.println(counter.value());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
