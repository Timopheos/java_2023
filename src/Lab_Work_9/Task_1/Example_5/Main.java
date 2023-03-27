package Lab_Work_9.Task_1.Example_5;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("3");
    }

}
