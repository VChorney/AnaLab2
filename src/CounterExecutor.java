import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class CounterExecutor {

  public static void main(String[] args) {

    Counter counter = new Counter();
    CounterIncrementThread firstIncrementThread = new CounterIncrementThread(counter);
    CounterIncrementThread secondIncrementThread = new CounterIncrementThread(counter);
    firstIncrementThread.run();
    secondIncrementThread.run();
    CounterDecrementThread firstDecrementThread = new CounterDecrementThread(counter);
    CounterDecrementThread secondDecrementThread = new CounterDecrementThread(counter);
    firstDecrementThread.run();
    secondDecrementThread.run();
  }
}
