public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadExtender threadExtender = new ThreadExtender(counter);
        ThreadRunner threadRunner = new ThreadRunner(counter);

        threadExtender.start();
        threadRunner.run();
    }
}
