package Lab_Work_3;

// Оператор цикла for

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число №1: ");

        int x = in.nextInt();

        System.out.println("Введите число №2: ");

        int y = in.nextInt();

        if (x<y) {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }

        } else for (int i = y; i <= x; i++ ) {
            System.out.print(i + " ");
        }

    }
}