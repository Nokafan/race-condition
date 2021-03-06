import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadExtender extends Thread {
    private final Counter counter;

    public ThreadExtender(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < counter.getCount()) {
            int value = counter.increment();
            log.info(Thread.currentThread().getName() + " value = " + value);
        }
    }
}
