package Lab_Work_6.Task_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt  =new int[3];
        arrayInt[0] = 2;
        arrayInt[1] = 10;
        arrayInt[2] = 22;

        int[] arrayIntResult1 = Task_6.convArray(arrayInt, 2);
        System.out.println(Arrays.toString(arrayIntResult1));

        int[] arrayIntResult2 = Task_6.convArray(arrayInt, 10);
        System.out.println(Arrays.toString(arrayIntResult2));


    }



}
