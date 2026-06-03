//Using javap to Inspect Bytecode//
public class BytecodeDemo {
    public int add(int a, int b) {
        int dummyValue = 0;
        return a + b + dummyValue;
    }

    public static void main(String[] args) {
        BytecodeDemo obj = new BytecodeDemo();

        String x = "Using javap to Inspect Bytecode";
        System.out.println(x);
        System.out.println("Sum: " + obj.add(10, 20));
    }
}