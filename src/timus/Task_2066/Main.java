package timus.Task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result;

        if (b == 0 || b == 1 || c == 1) {
            result = a - b - c;
        } else {
            result = a - c * b;
        }


        System.out.println(result);
    }
}
