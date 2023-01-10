package Lab_Work_6.Task_6;

public class Task_6 {
    public static int[] convArray(int[] arrayInt, int value){
        if(value >= arrayInt.length){
            return arrayInt;
        }
        int[] arrayIntResult = new int[value];
        for(int i=0 ; i < value; i++){
            arrayIntResult[i] = arrayInt[i];
        }
        return arrayIntResult;

    }

}
