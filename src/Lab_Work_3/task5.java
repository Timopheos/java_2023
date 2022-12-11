package Lab_Work_3;

// Операторы for while

import java.util.Random;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в сумме: ");

        int size = in.nextInt();

        if (size > 0) {

            Random random = new Random();

            int[] ints = new int[size];

            int x = 0;
            int y = 0;

            for (int i = 0; i < ints.length; i++) {
                boolean iterator = true;

                while (iterator) {
                    x = random.nextInt(200);

                    if (x % 5 == 2 || x % 3 == 1) {
                        System.out.print(x + " ");
                        y = (y + x);
                        iterator = false;
                    }
                }


            }
            System.out.println("");
            System.out.println("Сумма чисел: " + y);
        } else System.out.println("Введено некорректное значение");

    }
}
