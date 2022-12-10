package Lab_Work_3;

// На основе оператора выбора switch

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Текущий день недели (с заглавной буквы): ");
        String day = in.nextLine();

        switch (day) {
            case "Понедельник":
                System.out.print("День №1.");
                break;
            case "Вторник":
                System.out.print("День №2.");
                break;
            case "Среда":
                System.out.print("День №3.");
                break;
            case "Четверг":
                System.out.print("День №4.");
                break;
            case "Пятница":
                System.out.print("День №5.");
                break;
            case "Суббота":
                System.out.print("День №6.");
                break;
            case "Воскресенье":
                System.out.print("День №7.");
                break;
            default:
                System.out.print("Ошибка в названии.");
        }

    }
}
