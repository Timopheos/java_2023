package Lab_Work_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования: ");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i];

        }

        System.out.println(Arrays.toString(chars));


    }
}
