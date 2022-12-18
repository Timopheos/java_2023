package Lab_Work_4;

public class Task7 {

    public static void main(String[] args) {


        int i = 0;
        int j = 0;

        int[][] Arr = new int[6][6];

        for (i = 0; i < 6; i++) {
            Arr[i][j] = 1;
        }

        i = 5;
        for (j = 5; j < 1; j--) {
            Arr[i][j] = 1;
        }

        j = 1;
        for (i = 0; i < 4; i++) {
            Arr[i][j] = 1;
        }

        i = 4;
        for (j = 5; j < 2; j--) {
            Arr[i][j] = 1;
        }

        j = 2;
        for (i = 0; i < 3; i++) {
            Arr[i][j] = 1;
        }

        i = 3;
        for (j = 5; j < 3; j--) {
            Arr[i][j] = 1;
        }

        j = 3;
        for (i = 0; i < 2; i++) {
            Arr[i][j] = 1;
        }

        i = 2;
        for (j = 5; j < 4; j--) {
            Arr[i][j] = 1;
        }

        j = 4;
        for (i = 0; i < 1; i++) {
            Arr[i][j] = 1;
        }

        Arr[1][5] = 1;
        Arr[0][5] = 1;

    }
}
