class Student {
    String name;
    int regNo;
    int[] marks = new int[5];

    public Student(String name, int regNo, int[] marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;
    }

    public void display() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / 5.0;

        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + regNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};
        Student student = new Student("John Doe", 12345, marks);
        student.display();
    }
}
