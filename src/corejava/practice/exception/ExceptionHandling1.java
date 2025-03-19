package corejava.practice.exception;
public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    public static void methodA() throws Exception {
        methodB();
    }

    public static void methodB() throws Exception {
        throw new Exception("Exception in methodB");
    }
}
