package Lab_Work_3;

// Оператор цикла While

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел в последовательности: ");

        int x = in.nextInt();
        int y = 1;
        int z = 1;
        int r = 0;

        if (x>0) {

            while (r < x) {
                System.out.print(z + " ");
                y = (z+y);
                z = (y-z);
                r++;
            }

        } else System.out.println("Введено некорректное число.");

    }
}
