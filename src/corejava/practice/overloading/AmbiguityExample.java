package corejava.practice.overloading;

public class AmbiguityExample {
    void show(int a, float b) {
        System.out.println("int, float method");
    }

    void show(float a, int b) {
        System.out.println("float, int method");
    }

    public static void main(String[] args) {
        AmbiguityExample obj = new AmbiguityExample();
        obj.show(10, 10.5f); // ❌ Compilation Error: Ambiguous method call
    }
}
















