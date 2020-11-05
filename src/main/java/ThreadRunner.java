import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadRunner implements Runnable {
    private final Counter counter;

    public ThreadRunner(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Thread-1");
        int value = 0;
        while (counter.getValue() < 100) {
            value = counter.increment();
            log.info(Thread.currentThread().getName() + " value = " + value);
        }
    }
}
