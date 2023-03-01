package timus.Task_1880;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String inputFileName ="src/timus/Task_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshallAndLilly = 2;



            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));


    }
}
