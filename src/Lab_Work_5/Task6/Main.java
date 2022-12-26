package Lab_Work_5.Task6;

public class Main {

    public static void main(String[] args) {

        Task6 task6 = new Task6();

        task6.setEx1(-6);
        System.out.println("Один аргумент Min " + task6.getMin());
        System.out.println("Один аргумент Max " + task6.getMax());


        task6.setEx2(12, 3);
        System.out.println("Два аргумента Min " + task6.getMin());
        System.out.println("Два аргумента Max " + task6.getMax());

        Task6 task6_1 = new Task6(13, 11);
        System.out.println("Конструктор Min " + task6_1.getMin());
        System.out.println("Конструктор Max " + task6_1.getMax());
    }



}
