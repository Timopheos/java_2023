package Lab_Work_3;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 7: ");
        String day = in.nextLine();

        switch (day) {
            case "1":
                System.out.print("Понедельник.");
                break;
            case "2":
                System.out.print("Вторник.");
                break;
            case "3":
                System.out.print("Среда.");
                break;
            case "4":
                System.out.print("Четверг");
                break;
            case "5":
                System.out.print("Пятница");
                break;
            case "6":
                System.out.print("Суббота.");
                break;
            case "7":
                System.out.print("Воскресенье");
                break;
                        default:
                System.out.print("Вы ввели число вне диапазона.");}
    }
}
