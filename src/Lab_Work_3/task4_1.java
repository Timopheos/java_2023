package Lab_Work_3;

// Оператор цикла While

import java.util.Scanner;

public class task4_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число №1: ");

        int x = in.nextInt();

        System.out.println("Введите число №2: ");

        int y = in.nextInt();

        if (x<y) {
            int i = x;
                while (i <= y) {
                System.out.print(i + " ");
                i++;
            }

        } else {
            int i = y;

            while (i <= x) {
            System.out.print(i + " ");
            i++;
            }
        }

    }
}