package Lab_Work_2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();
        int res = x % 5;
        int res_2 = x % 7;


        System.out.println("Остаток от деления на 5: " + res);
        System.out.println("Остаток от деления на 7: " + res_2);

        if (res == 2) {
            System.out.println("При делении на 5 остаток равен 2.");
        } else {
            System.out.println("При делении на 5 остаток не равен 2");

        }
        if (res_2 == 1) {
            System.out.println("При делении на 7 остаток равен 1.");
        } else {
            System.out.println("При делении на 7 остаток не равен 1.");

        }

    }
}