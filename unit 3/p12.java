public class LocalInnerClassDemo {
    void getValue() {
        int num = 100;

        class LocalInner {
            void printValue() {
                System.out.println("Value from Local Inner Class: " + num);
            }
        }

        LocalInner inner = new LocalInner();
        inner.printValue();
    }

    public static void main(String[] args) {
        LocalInnerClassDemo demo = new LocalInnerClassDemo();
        demo.getValue();
    }
}