package Lab_Work_1;

import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input First Name: ");
        String firstName = in.nextLine();

        System.out.print("Input Name: ");
        String name = in.nextLine();

        System.out.print("Input Patrynomic: ");
        String secondName = in.nextLine();

        System.out.println("First Name:" +firstName);
        System.out.println("Name:" +name);
        System.out.println("Patrynomic:" +secondName);
        in.close();
    }
}