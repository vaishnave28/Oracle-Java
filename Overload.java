public class Overload {
    private int a, b;
    public void setValues(int a) {
        this.a = a;
        this.b = 0;
    }
    public void setValues(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }
  public static void main(String[] args) {
        Overload obj = new Overload();
        obj.setValues(10);
        obj.display();
        obj.setValues(20, 30);
        obj.display();
    }
}
