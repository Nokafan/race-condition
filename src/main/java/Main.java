public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread threadExtender = new ThreadExtender(counter);
        Thread threadRunner = new Thread(new ThreadRunner(counter));

        threadExtender.start();
        threadRunner.start();
    }
}
