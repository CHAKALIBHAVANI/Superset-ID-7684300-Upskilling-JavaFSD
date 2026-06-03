import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store student names
        ArrayList<String> names = new ArrayList<>();

        // Number of names
        int n = sc.nextInt();
        sc.nextLine();

        // Add names
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        // Display names
        System.out.println(names);

        sc.close();
    }
}