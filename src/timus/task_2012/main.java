package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int tasks = in.nextInt();

        int difference = 12 - tasks;

        int time = difference * 45;

//        if (time <= 240) {
//            System.out.println("YES");
//        } else System.out.println("NO");

        String result = time <=240 ? "Yes" : "NO";

        System.out.println(result);

        out.flush();
    }
}
