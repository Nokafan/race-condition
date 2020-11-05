import lombok.Data;
import lombok.extern.log4j.Log4j;

@Log4j
@Data
public class Counter {
    private int value = 0;

    public int increment() {
        value++;
        return value;
    }
}
