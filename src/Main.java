public class Main {
    public static void main(String[] args) {
        int []arr= new int[10];
            try {
                int a = 10 / 0; // causes ArithmeticException
                System.out.println("afterException");

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
            catch (Exception e){
                System.out.println("Exception"+ e);
            }
            try{
            int ans= arr[11];
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

            finally {
                System.out.println("This always runs.");
            }

        System.out.println("End of code");
    }
}
