class Parent {
    void print() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentChild = new Child();

        parent.print();          // method of parent class by object of parent class
        child.print();           // method of child class by object of child class
        parentChild.print();     // method of parent class by object of child class
    }
}
