package Lab_Work_3;

import java.util.Arrays;
import java.util.Collections;


public class task8 {

    public static void main(String[] args) {
//
//
//        String[] Arr = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M"};
//
//        System.out.println(Arrays.toString(Arr));
//
//        char[] arr = new char[26];
//        for(char c = 'A'; c <= 'Z'; ++c) {
//            arr[c - 'A'] = c;
//
//        }
//        System.out.println(arr);

        char i = 10;
        char[] abc = new char[i];
        char z = 0;
        String x = "A";


        while (i >= z) {
            abc[z] = x;
            System.out.print(abc[i] + " ");
            x++;
            z++;
        }
    }
}