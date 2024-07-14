public class Mainmultiplethreads {
    public static void main(String[] args) throws InterruptedException {
        for (String name : new String[]{"Thread 1", "Thread 2", "Thread 3"}) {
            Thread t = new Thread(() -> {
                System.out.println(name + " started.");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
                System.out.println(name + " finished.");
            });
            t.start();
            t.join();
            Thread.sleep(500);
        }
    }
}
