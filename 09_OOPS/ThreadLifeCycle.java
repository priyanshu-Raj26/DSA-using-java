class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is RUNNING");
        try {
            Thread.sleep(2000);  // Thread goes to TIMED_WAITING state
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread finished execution");
    }
}

                                                    //    NEW
                                                    //     ↓
                                                    // start()
                                                    //     ↓
                                                    // RUNNABLE ←──────────┐
                                                    //     ↓               │
                                                    // RUNNING             │
                                                    //     ↓               │
                                                    //     ├──→ BLOCKED ───┘
                                                    //     ├──→ WAITING ───┘
                                                    //     ├──→ TIMED_WAITING ┘
                                                    //     ↓
                                                    // TERMINATED



public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        
        // NEW state
        System.out.println("State after creation: " + t1.getState());
        
        // RUNNABLE state
        t1.start();
        System.out.println("State after start(): " + t1.getState());
        
        // Allow thread to run
        Thread.sleep(100);
        System.out.println("State while running: " + t1.getState());
        
        // Wait for thread to complete
        t1.join();
        
        // TERMINATED state
        System.out.println("State after completion: " + t1.getState());
    }
}