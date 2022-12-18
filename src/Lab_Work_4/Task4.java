package Lab_Work_4;

public class Task4 {
    public static void main(String[] args) {


        int x = 5;
        int y = 5;

        int[][] Arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                if (j <= i) {

                    Arr[i][j] = 0;
                    System.out.print(Arr[i][j] + " ");
                } else {


                }

            }
        }
    }
}

