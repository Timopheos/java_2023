package Lab_Work_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int x = in.nextInt();
        if (x>0) {
            Integer[] Arr = new Integer[x];
            int c = 0;

            Random random = new Random();

            for (int i = 0; i < x; i++) {
                c = random.nextInt(1000);

                Arr[i] = c;
            }

            Arrays.sort(Arr, Collections.reverseOrder());

            System.out.println(Arrays.toString(Arr));
        } else System.out.println("Веедено некорректное значение.");








    }
}