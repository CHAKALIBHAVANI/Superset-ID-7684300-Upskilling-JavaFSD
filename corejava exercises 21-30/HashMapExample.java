import java.util.HashMap;
import java.util.Scanner;

class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store student id and name
        HashMap<Integer, String> students = new HashMap<>();

        // Number of students
        int n = sc.nextInt();

        // Add entries
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            students.put(id, name);
        }

        // Search student by id
        int searchId = sc.nextInt();

        System.out.println(students.get(searchId));

        sc.close();
    }
}