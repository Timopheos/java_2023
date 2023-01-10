package Lab_Work_6.Task_7;

import java.util.Arrays;

public class Task_7 {

    public static String convArray(char[] ch1){
        int[] int1 = new int[ch1.length];
        for(int i = 0; i < ch1.length; i++){
            int1[i] = (int) ch1[i] ;
        }
        String result = Arrays.toString(int1);

        return result;

    }

}
