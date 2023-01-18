package Lab_Work_6.Task_9;

public class Task_9 {

    public static char[] Array(char[] ch1) {
        int x = (ch1.length + 1) / 2;
        char y;

        for (int i = 1; i < x; i++) {
            y = ch1[i-1];
            ch1[i-1] = ch1[ch1.length-i];
            ch1[ch1.length-i] = y;

        }
        return ch1;
    }
}
