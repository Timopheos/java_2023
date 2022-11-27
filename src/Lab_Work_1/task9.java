package Lab_Work_1;

import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input Name: ");
        String name = in.nextLine();

        System.out.print("Input Age: ");
        int age = in.nextInt();

        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        in.close();
    }
}
