import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of elements
        int size = input.nextInt();

        int[] numbers = new int[size];

        int totalSum = 0;

        // Read array elements and calculate sum
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt(); // store value
            totalSum += numbers[index]; // add to sum
        }

        // Calculate average
        double averageValue = (double) totalSum / size;

        // Output results
        System.out.println("Sum = " + totalSum);
        System.out.println("Average = " + averageValue);

        input.close();
    }
}