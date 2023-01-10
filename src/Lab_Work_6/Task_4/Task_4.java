package Lab_Work_6.Task_4;

public class Task_4 {
    public static int fact1(int n) {
        int result = n;
        if (n % 2 == 0){
            while (n > 2) {
                result = result * (n - 2);
                n = n - 2;
            }

        }else {
                while (n > 1) {
                    result = result * (n - 2);
                    n = n - 2;

            }

        }
        return result;
    }

}
