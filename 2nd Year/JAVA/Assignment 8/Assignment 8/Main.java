public class Main {

    public static void main(String[] args) {

        System.out.println("Thread 1 started.");
        System.out.println("Thread 2 started.");

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

        // using yield() method to prevent Thread 1 from running
        Thread.yield();

        // using join() method to prevent Thread 2 from running until Thread 1 finishes
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 2 finished.");
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
