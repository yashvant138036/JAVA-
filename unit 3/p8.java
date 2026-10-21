public class ExceptionPropagationDemo {
    void method1() {
        int data = 50 / 0; 
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception propagated and caught in method3: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        obj.method3();
    }
}