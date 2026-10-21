public class ExceptionChainingDemo {
    public static void main(String[] args) {
        try {
            try {
                throw new ArithmeticException("Primary Cause: Division by zero");
            } catch (ArithmeticException e) {
                
                throw new RuntimeException("Wrapper Exception Occurred", e);
            }
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Actual Cause: " + e.getCause());
        }
    }
}