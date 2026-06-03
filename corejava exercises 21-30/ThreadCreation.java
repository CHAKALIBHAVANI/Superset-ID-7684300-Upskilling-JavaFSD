class MyThread extends Thread {

    // Code executed by thread
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class ThreadCreation {
    public static void main(String[] args) {

        // Create and start two threads
        new MyThread().start();
        new MyThread().start();
    }
}