public class VirtualThreadDemo {
    public static void main(String[] args) throws Exception {
        String dummyTitle = "Virtual Threads Java 21";

        System.out.println(dummyTitle);

        long start = System.currentTimeMillis();

        // Creating 100000 lightweight virtual threads
        for (int i = 1; i <= 100000; i++) {
            int taskNumber = i;

            Thread.startVirtualThread(() -> {
                if (taskNumber <= 5) {
                    System.out.println("Virtual thread running: " + taskNumber);
                }
            });
        }

        long end = System.currentTimeMillis();

        System.out.println("Threads launched successfully");
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}