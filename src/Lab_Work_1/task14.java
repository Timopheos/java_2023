package Lab_Work_1;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Сколько вам лет: ");
        int age = in.nextInt();



        if (age < 1 || age > 120) {
            System.out.println("Error.");
        }
        else {
            age = (2022 - age);
            System.out.println("Год вашего рождения: " + age + ".");
        }

        in.close();

    }
}
