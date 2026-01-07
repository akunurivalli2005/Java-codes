class KeywordsDemo {

    int number = 10;          // instance variable
    static int value = 20;    // static keyword

    void show() {
        int number = 30;      // local variable
        System.out.println("Local variable number: " + number);
        System.out.println("Instance variable number: " + this.number);
    }

    public static void main(String[] args) {

        KeywordsDemo obj = new KeywordsDemo();  // new keyword
        obj.show();

        System.out.println("Static value: " + value);
    }
}
