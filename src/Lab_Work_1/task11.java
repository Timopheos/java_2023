package Lab_Work_1;

import java.util.Scanner;
    public class task11 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Текущий месяц (с заглавной буквы): ");
            String month = in.nextLine();

            System.out.print("Дней в месяце: ");
            int d = in.nextInt();

            System.out.print("В ");

            switch (month) {
                case "Январь":
                    System.out.print(" январе ");
                    break;
                case "Февраль":
                    System.out.print(" феврале ");
                    break;
                case "Март":
                    System.out.print(" марте ");
                    break;
                case "Апрель":
                    System.out.print(" апреле ");
                    break;
                case "Май":
                    System.out.print(" мае ");
                    break;
                case "Июнь":
                    System.out.print(" июне ");
                    break;
                case "Июль":
                    System.out.print(" июле ");
                    break;
                case "Август":
                    System.out.print(" августе ");
                    break;
                case "Сентябрь":
                    System.out.print(" сентябре ");
                    break;
                case "Октябрь":
                    System.out.print(" октябре ");
                    break;
                case "Ноябрь":
                    System.out.print(" ноябре ");
                    break;
                case "Декабрь":
                    System.out.print(" декабре ");
                    break;
                default:
                    System.out.print(" error ");}


                System.out.print(d);

                    if (d <= 0) {
                        System.out.print(" error ");
                    } else if (d == 1 | d == 21 | d == 31) {
                        System.out.print(" день.");
                    } else if (d == 2 | d == 3 | d == 4 | d == 22 | d == 23 | d == 24) {
                        System.out.print(" дня.");
                    } else if (d>31) {
                        System.out.print(" error.");
                    } else System.out.print(" дней.");




            }
        }
