public class Q2 {
    public static void main(String[] args) {
        Q1 obj = new Q1();

        // Thread A - waits
        Thread threadA = new Thread(() -> obj.waitingMethod());

        // Thread B - notifies
        Thread threadB = new Thread(() -> {
            try {
                Thread.sleep(1000); // ensure Thread A starts waiting
            } catch (InterruptedException e) {}
            obj.notifyingMethod();
        });

        threadA.start();
        threadB.start();
    }
}