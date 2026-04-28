package Loops;

public class hw {
    int a;
    String s;

    // Default constructor
    hw() {
        this(100, "Sonu");   // calling parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    hw(int x, String y) {
        a = x;
        s = y;
        System.out.println(a + " " + s);
    }
}

class hw158 {
    public static void main(String[] args) {

        new hw();   // calls default → then parameterized
    }
}
