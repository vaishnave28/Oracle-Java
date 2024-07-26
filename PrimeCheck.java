class PrimeCheck implements Runnable {
    private int num;
    PrimeCheck(int num) { this.num = num; }
    public void run() {
        if (num <= 1) System.out.println(num + " is not Prime");
        else {
            for (int i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0) { System.out.println(num + " is not Prime"); return; }
            System.out.println(num + " is Prime");
        }
    }
    public static void main(String[] args) {
        for (int n : new int[]{4, -10, 0, 5, 15, 87, 11})
            new Thread(new PrimeCheck(n)).start();
    }
}
