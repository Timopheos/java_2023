package Lab_Work_9.Task_1.Example_1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw  new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1  "+ e);  // исключение обработано
        }
        System.out.println("2");
    }

}
