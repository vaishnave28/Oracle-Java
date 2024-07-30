class NaturalNumbersThread extends Thread {
    private int start;

    public NaturalNumbersThread(int start) {
        this.start = start;
    }

    public void run() {
        try {
            for (int i = start; i < start + 10; i++) {
                System.out.println(i);
                Thread.sleep(500); // sleep for 500 milliseconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NaturalNumbersThread t1 = new NaturalNumbersThread(1);
        NaturalNumbersThread t2 = new NaturalNumbersThread(11);
        NaturalNumbersThread t3 = new NaturalNumbersThread(21);

        t1.start();
        t2.start();
        t3.start();
    }
}
