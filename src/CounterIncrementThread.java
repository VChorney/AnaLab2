import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class CounterIncrementThread extends Thread {

  private Counter counter;
  private ReentrantLock lock = new ReentrantLock();

  public CounterIncrementThread(Counter counter) {
    this.counter = counter;
  }

  public void run() {
    try {
      lock.tryLock(10, TimeUnit.SECONDS);
      counter.increment();
      System.out.println(counter.value());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }
}
