package Lab_Work_2;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();
        int y = 1000;

        if ((x/y) > 1) {
            System.out.println("В данном числе " + (x/y) + " тыс.");
        } else System.out.println("Данное число меньше тысячи");

    }

}
