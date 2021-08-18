import java.util.concurrent.locks.LockSupport;

public class Test {

    public static void main(String[] args) throws Exception {
        Test4 t = new Test4();
        t.start();
        System.out.println("sleep 1000 ms");
        Thread.sleep(1000);
        t.interrupt();
    }

    public static class Test4 extends Thread {

        public void run() {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("interrupt");
            }
            LockSupport.park();
        }
    }

}
