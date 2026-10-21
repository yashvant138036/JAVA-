class Outer {
    static String msg = "Static Inner Class Demo";

    static class StaticNestedClass {
        void show() {
            System.out.println("Message from static inner class: " + msg);
        }
    }
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer.StaticNestedClass nested = new Outer.StaticNestedClass();
        nested.show();
    }
}