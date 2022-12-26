package Lab_Work_5.Task5;

public class Main {

    public static void main(String[] args) {

        Task5 task5 = new Task5();
        task5.setIn();
        System.out.println("Метод без аргумента " + task5.getIn());

        task5.setIn(150);
        System.out.println("Метод с аргументом " + task5.getIn());

        Task5 task5_1 = new Task5(95);
        System.out.println("Конструктор " + task5_1.getIn());




    }

}
