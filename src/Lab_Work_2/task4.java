package Lab_Work_2;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();

        if (x >= 5 && x <= 10) {
            System.out.println("Данное число попадает в диапазон от 5 до 10.");
        } else System.out.println("Данное число не попадает в диапазон от 5 до 10.");

    }

}
