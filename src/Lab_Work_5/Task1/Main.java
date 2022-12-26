package Lab_Work_5.Task1;

import Lab_Work_5.Task2.Task2;
import Lab_Work_5.Task3.Task3;

public class Main {

    public static void main(String[] args) {

        //Задача №1.
        System.out.println("Task1:");

        Task1 task1 = new Task1();

        task1.setCh1('K');

        System.out.println("getCodeSymbol " + task1.getCodeSymbol());

        task1.showCodeAndValue();

    }

}

