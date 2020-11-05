import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadExtender extends Thread {
    private static final int COUNT = 100;
    private final Counter counter;

    public ThreadExtender(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        int value = 0;
        while (counter.getValue() < COUNT) {
            value = counter.increment();
            log.info(Thread.currentThread().getName() + " value = " + value);
        }
    }
}
