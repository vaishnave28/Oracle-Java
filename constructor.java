class SuperClass {
    int value;
    SuperClass(int value) { this.value = value; }
}
class SubClass extends SuperClass {
    int value;
    SubClass(int superValue, int subValue) {
        super(superValue);
        this.value = subValue;
    }

    void display() {
        System.out.println(super.value + ", " + value);
    }
    public static void main(String[] args) {
        new SubClass(100, 200).display();
        new SubClass(10, 20).display();
        new SubClass(-20, -30).display();
        new SubClass(0, 0).display();
    }
}
