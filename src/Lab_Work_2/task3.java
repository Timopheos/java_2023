package Lab_Work_2;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();
        int res = x % 4;

        if (res == 0 && x > 10) {
            System.out.println("Данное число делится на 4 без остатка, и оно больше 10.");
        } else if (x > 10) {
            System.out.println("Данное число больше 10, но не делится на 4 без остатка");
        } else if (res == 0){
                System.out.println("Данное число делится на 4 без остатка, но оно меньше 10.");
            } else System.out.println("Данное число меньше 10 и не делится на 4 без остатка");
        }

    }
