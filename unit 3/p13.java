class OuterInterfaceDemo {
    interface Message {
        void printMessage();
    }
}

class InterfaceImpl implements OuterInterfaceDemo.Message {
    public void printMessage() {
        System.out.println("Implemented nested interface method.");
    }
}

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        OuterInterfaceDemo.Message msg = new InterfaceImpl();
        msg.printMessage();
    }
}