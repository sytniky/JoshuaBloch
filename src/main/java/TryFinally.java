public class TryFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Test 1");
            System.out.println("Test 3");
            throw new RuntimeException();
        } finally {
            System.out.println("Test 2");
        }
    }
}
