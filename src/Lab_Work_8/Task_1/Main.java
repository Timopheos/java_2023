package Lab_Work_8.Task_1;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File f1 = new File("E:\\Study_2022\\Files\\File1.txt");
            f1.createNewFile();
            DataOutputStream out = new DataOutputStream(new FileOutputStream(f1));



            out.writeUTF("Row1qwe");
            out.writeUTF("Tesrow2qz");
            out.writeDouble(2);
            out.writeDouble(3425.324);
            out.writeDouble(9545);


            File f2 = new File("E:\\Study_2022\\Files\\File2.txt");
            BufferedReader br = new BufferedReader(new FileReader("E:\\Study_2022\\Files\\File1.txt"));








        } catch (IOException e) {
            System.out.println("End of file");
        }


    }
}



 /*   Создать проект, позволяющий из одного, предварительно
    созданного программными средствами файла, переписать данные,
        соответствующие условию - в исходном файле содержится две строки в
        формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
        вторую строку и положительные числа.*/