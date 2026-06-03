import java.util.ArrayList;
import java.util.Collections;

class LambdaExpressionDemo {
    public static void main(String[] args) {

        // Store strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Krishna");
        names.add("Sneha");
        names.add("RamSita");

        // Sort using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}