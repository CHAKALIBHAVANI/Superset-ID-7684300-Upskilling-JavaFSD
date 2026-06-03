import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamAPIDemo {
    public static void main(String[] args) {

        // Store numbers
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        // Filter even numbers
        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);
    }
}