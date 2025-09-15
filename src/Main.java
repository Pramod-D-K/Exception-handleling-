public class Main {
    public static void main(String[] args) {
            try {
                int a = 10 / 0; // causes ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            } finally {
                System.out.println("This always runs.");
            }
    }
}
