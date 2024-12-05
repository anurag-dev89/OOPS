class OuterClass {
    // Outer class method
    void display() {
        System.out.println("Outer class display");
    }
    // Inner class inside OuterClass
    class InnerClass {
        // Inner class method
        void display() {
            System.out.println("Inner class display");
        }
    }
}
public class Prog8 {
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outer = new OuterClass();
        outer.display();  // Call outer class display method

        // Create an instance of the inner class using the outer class object
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();  // Call inner class display method
    }
}