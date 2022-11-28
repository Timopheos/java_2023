package Lab_Work_1;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Год вашего рождения: ");
        int y = in.nextInt();

        y = (2022 - y);

        System.out.println("Вас зовут: " + name +".");
        in.close();



        if (y <= 6) {
            System.out.print("Вы слишком молоды.");
        } else if (y == 21 | y == 31 | y == 41 | y == 51 | y == 61 | y == 71 | y == 81 | y == 91 | y == 101) {
            System.out.print("Вам " + y + " год.");
        } else if (y == 22 | y == 23 | y == 24 | y == 32 | y == 33 | y == 34 | y == 42 | y == 43 | y == 44 | y == 52 | y == 53 | y == 54 | y == 62 | y == 63 | y == 64 | y == 72 | y == 73 | y == 74 | y == 82 | y == 83 | y == 84 | y == 92 | y == 93 | y == 94) {
            System.out.print("Вам " + y + " года.");
        } else if (y > 101) {
            System.out.print("Вы слишком стары.");
        } else System.out.print("Вам " + y + " лет.");
    }

}

