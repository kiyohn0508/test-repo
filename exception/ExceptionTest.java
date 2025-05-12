package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int r = 0;

        try {
            r = i/j;
        } catch(Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Program done");
        }
    }
}
