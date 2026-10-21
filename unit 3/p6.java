import java.io.IOException;

public class ThrowsKeywordDemo {
    static void checkFile() throws IOException {
        throw new IOException("File not found error.");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("Caught handled exception: " + e.getMessage());
        }
    }
}