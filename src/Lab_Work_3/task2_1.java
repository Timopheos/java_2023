package Lab_Work_3;

// На основе условных операторов.

import java.util.Scanner;

public class task2_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Текущий день недели (с заглавной буквы): ");
        String day = in.nextLine();

        if (day.equals("Понедельник")) {
            System.out.print("День №1.");
        } else if (day.equals("Вторник")) {
            System.out.print("День №2.");
        } else if (day.equals("Среда")) {
            System.out.print("День №3.");
        } else if (day.equals("Четверг")) {
            System.out.print("День №4.");
        } else if (day.equals("Пятница")) {
            System.out.print("День №5.");
        } else if (day.equals("Суббота")) {
            System.out.print("День №6.");
        } else if (day.equals("Воскресенье")) {
            System.out.print("День №7.");
        } else System.out.print("Ошибка в названии.");

    }
}