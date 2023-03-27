package Lab_Work_9.Task_1.Example_2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            System.out.println("1");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);

        }
        System.out.println("3");
    }

}
