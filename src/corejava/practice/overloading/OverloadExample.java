package corejava.practice.overloading;

public class OverloadExample {
    // Method 1: No parameters
    void display() {
        System.out.println("No parameters method called.");
    }

    // Method 2: One int parameter
    void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    // Method 3: Two parameters
    void display(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    // Method 4: Different return type (overloading allowed)
    void display(double a) {
        System.out.println("Double parameter: " + a);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(); // ✅ Calls Method 1
        obj.display(10); // ✅ Calls Method 2
        obj.display(20, "Hello"); // ✅ Calls Method 3
        obj.display(5.5); // ✅ Calls Method 4
        obj.display('c');
        obj.display(9999L);
       // obj.display(null); // It will throw error
    }
}

