package Lab_Work_3;

import java.util.Arrays;



public class task8 {

    public static void main(String[] args) {

        int i = 10;
        char[] abc = new char[i];
        int z = 0;
        char x = 'A';


        while (z < i) {
            if (x == 'A' || x=='E' || x=='I' || x=='O' || x=='U' || x=='Y') {
                x++;
            } else {
                abc[z] = x;
                System.out.print(abc[z] + " ");
                x++;
                z++;
            }

        }
    }
}