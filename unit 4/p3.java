class CustomThread extends Thread {
    
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread Executing -> Name: " + Thread.currentThread().getName() 
                           + " | Priority: " + Thread.currentThread().getPriority());
    }
}

public class p041 {
    public static void main(String[] args) {
       
        Thread mainThread = Thread.currentThread();
        System.out.println("Initial Main Thread Name: " + mainThread.getName());
        System.out.println("Initial Main Thread Priority: " + mainThread.getPriority());

        
        mainThread.setName("App-Main-Thread");
        mainThread.setPriority(Thread.MAX_PRIORITY); // Setting priority to 10

        System.out.println("\nUpdated Main Thread Name: " + mainThread.getName());
        System.out.println("Updated Main Thread Priority: " + mainThread.getPriority());
        System.out.println("--------------------------------------------------");

        
        CustomThread t1 = new CustomThread("Worker-Alpha");
        CustomThread t2 = new CustomThread("Worker-Beta");
        CustomThread t3 = new CustomThread("Worker-Gamma");

        
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1 (Minimum)
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (Normal - Default)
        t3.setPriority(8);                   // Custom Priority 8

        
        t1.start();
        t2.start();
        t3.start();
    }
}