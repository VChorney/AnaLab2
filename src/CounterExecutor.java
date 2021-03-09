public class CounterExecutor {

  public static void main(String[] args) {

    Counter counter = new Counter();
    new CounterIncrementThread(counter).start();
    new CounterDecrementThread(counter).start();

  }
}
