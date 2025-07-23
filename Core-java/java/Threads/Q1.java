class Q1 {
    public synchronized void waitingMethod() {
        System.out.println("Thread A: Waiting for notification...");
        try {
            wait(); // Thread A goes to waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread A: Got notification, resuming...");
    }

    public synchronized void notifyingMethod() {
        System.out.println("Thread B: Sending notification...");
        notify(); // Wakes up one thread waiting on this object
    }
}