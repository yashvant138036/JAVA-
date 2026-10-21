

4 of 1,315
Fwd:
Inbox

UNNATI CHAUHAN <unnati.chauhan136568@marwadiuniversity.ac.in>
Attachments
11:27 AM (7 hours ago)
to JAYMIS, me


---------- Forwarded message ---------
From: UNNATI CHAUHAN <unnati.chauhan136568@marwadiuniversity.ac.in>
Date: Mon, 19 Oct 2026, 7:17 pm
Subject:
To: UNNATI CHAUHAN <unnati.chauhan136568@marwadiuniversity.ac.in>




 5 Attachments
  •  Scanned by Gmail
class Counter {
    private int count = 0;

    
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class WorkerThread extends Thread {
    private Counter counter;

    public WorkerThread(Counter counter, String name) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println(Thread.currentThread().getName() + " finished executing.");
    }
}

public class p042 {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        
        WorkerThread t1 = new WorkerThread(sharedCounter, "Thread-1");
        WorkerThread t2 = new WorkerThread(sharedCounter, "Thread-2");

        
        t1.start();
        t2.start();

        try {
            
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        
        System.out.println("Final Expected Count: 2000");
        System.out.println("Actual Final Counter Value: " + sharedCounter.getCount());
    }
}