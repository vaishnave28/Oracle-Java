class Fibonacci implements Runnable {
    private int n;
    Fibonacci(int n) { this.n = n; }
    @Override
    public void run() {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        new Thread(new Fibonacci(5)).start();
        new Thread(new Fibonacci(7)).start();
        new Thread(new Fibonacci(0)).start();  // edge case: 0 terms
        new Thread(new Fibonacci(-10)).start(); // edge case: negative terms
    }
}
