import lombok.extern.log4j.Log4j;

@Log4j
public class ThreadExtender extends Thread {
    private final Counter counter = new Counter();

    @Override
    public void run() {
        int value = 0;
        while (value < 100) {
            value = counter.getValue();
            if (value <= 100) {
                log.info(Thread.currentThread().getName() + " value = " + value);
            }
        }
    }
}
