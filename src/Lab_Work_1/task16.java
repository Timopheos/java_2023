package Lab_Work_1;

import java.util.Scanner;

public class task16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = in.nextInt();
        int y = (x+1);
        int w = (x-1);
        int z = ((x+y+w)*(x+y+w));

        System.out.println(w + " " + x + " " + y + " " + z);
    }

}