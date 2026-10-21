public class SimpleExceptionHandling {
    public static void main(String[] args) {
        try {
            int numbers[] = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues execution smoothly.");
    }
}