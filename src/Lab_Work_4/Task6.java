package Lab_Work_4;

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        Random random = new Random();

        int x = 5;
        int y = 5;


        int[][] Arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                Arr[i][j] = random.nextInt(100);
                System.out.print(Arr[i][j] + " ");
            }
        }
        System.out.println();


        int zx = random.nextInt(x);
        if (zx == 0) {
            zx = zx;
        } else zx = zx - 1;
        System.out.println("Удаленная строка: " + (zx + 1));
        int zy = random.nextInt(y);
        if (zy == 0) {
            zy = zy;
        } else zy = zy - 1;
        System.out.println("Удаленный столбец: " + (zy + 1));


        int[][] Arr2 = new int[x][y];

        for (int i = 0; i < x; i++) {
            if (i == zx) {
                continue;
            } else {
                System.out.println();
                for (int j = 0; j < y; j++) {
                    if (j == zy) {
                        continue;
                    } else {
                        Arr2[i][j] = Arr[i][j];
                        System.out.print(Arr2[i][j] + " ");
                    }


                }
            }


        }
    }
}
