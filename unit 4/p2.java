class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Child Thread (Runnable) started running.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child Thread count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Child Thread interrupted.");
            }
        }
        System.out.println("Child Thread finished.");
    }
}

public class p040 {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        
        MyRunnable myRunnable = new MyRunnable();

        
        Thread t1 = new Thread(myRunnable);

        
        t1.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread finished.");
    }
}