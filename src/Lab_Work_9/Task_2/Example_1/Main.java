package Lab_Work_9.Task_2.Example_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int l = 6;
        int[] Arr = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.println("Введите значение элемента массива № " + i + ": ");
            int d = in.nextInt();
            Arr[i] = d;
            System.out.println(Arr[i]);
        }

        int e = 0;
        int w = 0;

        for (int i = 0; i < l; i++) {
            if (Arr[i] > 0) {
                e = e + Arr[i];
                w = w + 1;
            }
        }

        int average = e / w;

        System.out.println("Среднее значение положительных чисел = " + average);
        System.out.println(Arrays.toString(Arr));

    }

}
