package Lab_Work_1;

import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Текущий день недели (с заглавной буквы): ");
        String day = in.nextLine();

        System.out.print("Текущий месяц (с заглавной буквы): ");
        String month = in.nextLine();

        System.out.print("Число месяца: ");
        int date = in.nextInt();

        switch (day) {
            case "Понедельник":
                System.out.print("Сегодня понедельник, ");
                break;
            case "Вторник":
                System.out.print("Сегодня вторник, ");
                break;
            case "Среда":
                System.out.print("Сегодня среда, ");
                break;
            case "Четверг":
                System.out.print("Сегодня четверг, ");
                break;
            case "Пятница":
                System.out.print("Сегодня пятница, ");
                break;
            case "Суббота":
                System.out.print("Сегодня суббота, ");
                break;
            case "Воскресенье":
                System.out.print("Сегодня воскресенье, ");
                break;
            default:
                System.out.print("Error ");
        }

                System.out.print(date);

                switch (month) {
                    case "Январь":
                        System.out.print(" января.");
                        break;
                    case "Февраль":
                        System.out.print(" февраля.");
                        break;
                    case "Март":
                        System.out.print(" марта.");
                        break;
                    case "Апрель":
                        System.out.print(" апреля.");
                        break;
                    case "Май":
                        System.out.print(" мая.");
                        break;
                    case "Июнь":
                        System.out.print(" июня.");
                        break;
                    case "Июль":
                        System.out.print(" июля.");
                        break;
                    case "Август":
                        System.out.print(" августа.");
                        break;
                    case "Сентябрь":
                        System.out.print(" сентября.");
                        break;
                    case "Октябрь":
                        System.out.print(" октября.");
                        break;
                    case "Ноябрь":
                        System.out.print(" ноября.");
                        break;
                    case "Декабрь":
                        System.out.print(" декабря.");
                        break;
                    default:
                        System.out.print(" error.");
                }

        }

    }