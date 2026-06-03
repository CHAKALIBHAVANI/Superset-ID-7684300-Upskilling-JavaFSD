import java.lang.reflect.*;

class StudentInfo {
    public void showName() {
        System.out.println("Student Name: Bhavani");
    }

    public void showCourse() {
        System.out.println("Course: Core Java");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            String dummyTask = "Reflection in Java";

            Class<?> cls = Class.forName("StudentInfo");
            Object obj = cls.getDeclaredConstructor().newInstance();

            System.out.println(dummyTask);

            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println("Method found: " + method.getName());

                // Invoke method dynamically
                method.invoke(obj);
            }
        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}