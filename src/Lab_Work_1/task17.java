package Lab_Work_1;

import java.util.Scanner;

public class task17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число №1: ");
        int x = in.nextInt();
        System.out.print("Введите число №2: ");
        int y = in.nextInt();

        System.out.println("Сумма чисел: " + (x+y));
        System.out.println("Разность чисел: " + (x-y));
    }

}