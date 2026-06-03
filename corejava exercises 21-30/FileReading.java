import java.io.BufferedReader;
import java.io.FileReader;

class FileReading {
    public static void main(String[] args) throws Exception {

        // Open file
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));

        String line;

        // Read and print data
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}