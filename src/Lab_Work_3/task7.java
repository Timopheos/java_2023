package Lab_Work_3;

import java.util.Arrays;
import java.util.Scanner;


public class task7 {

    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int n = id.nextInt();

        char[] arr = new char[n];
        char c = 'a';
        int b = 0;

        while (b < n) {
            arr[b] = c;
            System.out.print(arr[b] + " ");
            ++c;
            ++c;
            ++b;
        }

        --b;
        c = arr[b];
        System.out.println(" ");

        while (b >= 0) {
            arr[b] = c;
            System.out.print(arr[b] + " ");
            --c;
            --c;
            --b;
        }
    }
}
