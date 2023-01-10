package Lab_Work_6.Task_3;
import java.util.Arrays;

public class Task_3 {

    public static void setIntsLarge(int[] ints) {
        Arrays.sort(ints);
        int n = ints.length;
        System.out.println("Максимальное число в массиве: " + ints[n-1]);

    }
    public static void setIntsSmallest(int[] ints) {
        Arrays.sort(ints);
        System.out.println("Минимальное число в массиве: " + ints[0]);

    }
    public static void setIntsAverage(int[] ints) {
        double sum = 0;
        for (int j = 0; j < ints.length; j++) {
            sum += ints[j];
        }
        double Average = sum / ints.length;
        System.out.println("Среднее значение: " + Average);

    }
}
