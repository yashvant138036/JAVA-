class OuterClass {
    private String message = "Hello from Outer Class!";

    class InnerClass {
        void display() {
            System.out.println("Inner Class accessing outer field: " + message);
        }
    }
}

public class SimpleInnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}