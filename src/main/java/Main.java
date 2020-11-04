public class Main {
    public static void main(String[] args) {
        ThreadExtender threadExtender = new ThreadExtender();
        ThreadRunner threadRunner = new ThreadRunner();

        threadExtender.start();
        threadRunner.run();
    }
}
