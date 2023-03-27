package Lab_Work_9.Task_1.Example_7;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");

        } catch (ArithmeticException e) {
            System.out.println("2");
            throw new ArithmeticException();
        }
        System.out.println("3");
    }
}
