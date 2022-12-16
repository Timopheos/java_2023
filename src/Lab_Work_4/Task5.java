package Lab_Work_4;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        Random random = new Random();

        int x = 5;
        int y = 3;

        int [][] Arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                Arr[i][j] = random.nextInt(100);
                System.out.print(Arr[i][j] + " ");

            }
        }

        System.out.println();

        int [][] Arr2 = new int[y][x];
        for (int i = 0; i < y; i++) {
            System.out.println();
            for (int j = 0; j < x; j++) {
                Arr2[i][j] = Arr[j][i];
                System.out.print(Arr2[i][j] + " ");
            }
        }


    }
}
