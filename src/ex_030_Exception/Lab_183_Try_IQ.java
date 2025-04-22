package ex_030_Exception;

public class Lab_183_Try_IQ {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
            int a = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//o?p-Cannot invoke "String.trim()" because "name" is null