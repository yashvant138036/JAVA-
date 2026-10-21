public class ThrowKeywordDemo {
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("User is not eligible to vote.");
        } else {
            System.out.println("User is eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}