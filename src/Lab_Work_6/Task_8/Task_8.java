package Lab_Work_6.Task_8;

public class Task_8 {
    public static int setIntsAverage(int[] ints) {
        int sum = 0;
        for (int j = 0; j < ints.length; j++) {
            sum += ints[j];
        }
        int Average = sum / ints.length;

        return Average;

    }
}
