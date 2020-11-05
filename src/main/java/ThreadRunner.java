import lombok.Data;
import lombok.extern.log4j.Log4j;

@Log4j
@Data
public class ThreadRunner implements Runnable {
    private static final int COUNT = 100;
    private final Counter counter;

    @Override
    public void run() {
        while (counter.getValue() < COUNT) {
            int value = counter.increment();
            log.info(Thread.currentThread().getName() + " value = " + value);
        }
    }
}
