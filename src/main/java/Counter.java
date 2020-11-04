import lombok.extern.log4j.Log4j;

@Log4j
public class Counter {
    private static int value = 0;

    public int getValue() {
        if (value <= 100) {
            value++;
        }
        return value;
    }
}
