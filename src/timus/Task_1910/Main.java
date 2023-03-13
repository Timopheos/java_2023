package timus.Task_1910;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/Task_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        PrintWriter out = new PrintWriter(System.out);
        int size = Integer.parseInt(bufferedReader.readLine());  //хранится значение из первой строки

        String[] strings = bufferedReader.readLine().split(" "); //считываются значения с разделением по пробелу и заносяться в массив

        int[] intsAfter = new int[size - 2];

        for (int i = 0; i < intsAfter.length; i++) {      // массив заполнится суммой каждых трех значений  по очереди прошлого массива
            intsAfter[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i + 1]) +
                    Integer.parseInt(strings[i + 2]);
        }

        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);     // сортировка значений результатов сложения
        Arrays.sort(intsAfter);

        int firstValue = intsAfter[intsAfter.length - 1];    //присвоили наибольшее значение первому значению

        for (int i = 0; i < intsAfter.length; i++) {              // ищем на каком месте наибольшее значение, +2 выдает значение средней секции
            if (ints[i] == firstValue) {
                out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        out.flush();

    }
}
