package Lab_Work_6.Task_10;

import java.util.Arrays;

public class Task_10 {

    public static int[] getMaxAndMinValue(int ... v){

        Arrays.sort(v);

        int[] arraayInt = new int[2];
        arraayInt[0] = v[0];
        arraayInt[1] = v[v.length-1];

        return arraayInt;
    }
}
