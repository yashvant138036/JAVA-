public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
            System.out.println("Result: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed regardless of exception occurrence.");
        }
    }
}