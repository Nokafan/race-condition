import lombok.Data;
import lombok.extern.log4j.Log4j;

@Log4j
@Data
public class ThreadRunner implements Runnable {
    private final Counter counter;

    @Override
    public void run() {
        while (counter.getValue() < counter.getCount()) {
            int value = counter.increment();
            log.info(Thread.currentThread().getName() + " value = " + value);
        }
    }
}
