class IdentifiersDemo {

    int studentAge = 20;
    String studentName = "Harshavalli";

    void display() {
        int marks = 85;
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        IdentifiersDemo obj = new IdentifiersDemo();
        obj.display();
    }
}
