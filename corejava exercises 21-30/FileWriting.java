import java.io.FileWriter;
import java.util.Scanner;

class FileWriting {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Take text
        String text = sc.nextLine();

        // Write text to file
        FileWriter fw = new FileWriter("output.txt");
        fw.write(text);
        fw.close();

        System.out.println("Data written to file");

        sc.close();
    }
}