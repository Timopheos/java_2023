package Lab_Work_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class task9 {

    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int size = id.nextInt();

        System.out.println("Размер массива равен " + size);

        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);

        }

        Arrays.sort(nums);

        System.out.println("Произведена сортировка массива ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i])
                max = nums[i];
            if (min >= nums[i])
                min = nums[i];

        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }
}

//    Напишите программу, в которой создается массив и заполняется
//        случайными числами. Массив отображается в консольном окне. В этом
//        массиве необходимо определить элемент с минимальным значением. В
//        частности, программа должна вывести значение элемента с минимальным
//        значением и индекс этого элемента. Если элементов с минимальным
//        значением несколько, должны быть выведены индексы всех этих элементов.
