class PatternSwitchDemo {

    // Check object type
    static void checkType(Object obj) {

        if (obj instanceof Integer) {
            System.out.println("Integer");
        } else if (obj instanceof String) {
            System.out.println("String");
        } else if (obj instanceof Double) {
            System.out.println("Double");
        } else {
            System.out.println("Other");
        }
    }

    public static void main(String[] args) {
        checkType(10);
        checkType("Java");
        checkType(25.5);
    }
}