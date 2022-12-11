package Lab_Work_3;

// Оператор цикла For

import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности: ");

        int x = in.nextInt();
        int y = 1;
        int z = 1;

        if (x>0) {

            for (int r = 0; r < x; r++) {
                System.out.print(z + " ");
                y = (z+y);
                z = (y-z);

            }

        } else System.out.println("Введено некорректное число.");

    }
}