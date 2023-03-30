package Lab_Work_9.Task_2.Example_2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        try {

            int x = 5;
            int y = 6;
            int[][] Arr = new int[x][y];

            for (int i = 0; i < x; i++) {
                System.out.println();
                for (int j = 0; j < y; j++) {
                    Arr[i][j] = random.nextInt(100);
                    System.out.print(Arr[i][j] + " ");

                }
            }

            System.out.println();

            System.out.println("Введите номер столбца, который нужно вывести на экран: ");
            int d = Integer.parseInt(in.nextLine());
            d = d - 1;
            if (d < 0 || d > x) {
                throw new NumberFormatException("Нет столбца с таким номером.");
            }

            for (int i = 0; i < x; i++) {
                y = d;
                System.out.print(Arr[i][y] + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
