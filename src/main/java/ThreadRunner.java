import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadRunner implements Runnable {
    private static final int COUNT = 100;

    private final Counter counter;

    public ThreadRunner(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Thread-1");
        int value = 0;
        while (counter.getValue() < COUNT) {
            value = counter.increment();
            log.info(Thread.currentThread().getName() + " value = " + value);
        }
    }
}
