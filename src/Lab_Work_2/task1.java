package Lab_Work_2;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();
        int result = x % 3;

        System.out.println("Остаток от деления: " + result);

        if (result == 0){
            System.out.print("Данное число делится на 3 без остатка.");
        }
        else {
            System.out.print("Данное число не делится на 3 без остатка.");
        }

    }

}