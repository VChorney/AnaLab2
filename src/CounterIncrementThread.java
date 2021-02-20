public class CounterIncrementThread extends Thread{

  private Counter counter;

  public CounterIncrementThread(Counter counter) {
    this.counter = counter;
  }

  public void run() {
    try {
      counter.increment();
      System.out.println(counter.value());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
