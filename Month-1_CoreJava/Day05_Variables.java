class VariablesDemo {

    int number = 10;   // instance variable

    void show() {
        int value = 20; // local variable
        System.out.println("Instance variable: " + number);
        System.out.println("Local variable: " + value);
    }

    public static void main(String[] args) {
        VariablesDemo obj = new VariablesDemo();
        obj.show();
    }
}
