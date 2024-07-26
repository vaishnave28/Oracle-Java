class Box {
    double w = 10, h = 10, d = 10;
    double volume() { return w * h * d; }
    public static void main(String[] args) {
        System.out.println("Volume: " + new Box().volume());
    }
}
