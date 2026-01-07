class Student {

    // Variables (Data Members)
    String name;
    int age;

    // Method (Member Function)
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age : " + age);
    }

    // Main method
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();

        // Assigning values
        s1.name = "Harshavalli";
        s1.age = 20;

        // Calling method
        s1.displayDetails();
    }
}
