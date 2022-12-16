package Lab_Work_4;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

       int [][] Arr = new int[8][10];

        for (int i = 0; i < Arr.length; i++) {
            System.out.println();
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] = 2;
                System.out.print(Arr[i][j] + " ");

            }
        }

    }
}
