package Lab_Work_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class task7 {

    public static void main(String[] args) {


//        String[] Arr = {"a", "c", "e", "g", "i", "k", "m", "o", "q", "s"};
//
//        Arrays.sort(Arr);
//
//        System.out.println(Arrays.toString(Arr));
//
//        Arrays.sort(Arr, Collections.reverseOrder());
//
//        System.out.println(Arrays.toString(Arr));


        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int n = id.nextInt();

        char[] arr = new char[n];
        char c = 'a';
        int b = 0;

        while (b <= n) {
            arr[b] = c;
            System.out.print(arr[b] + " ");
            ++c;
            ++c;
            ++b;
        }
        while (b > 0) {
            System.out.print(arr[b] + " ");
            --b;
        }


    }
}
