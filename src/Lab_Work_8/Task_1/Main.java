/*package Lab_Work_8.Task_1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            File f1 = new File("E:\\Study_2022\\Files\\File1.txt");
            f1.createNewFile();
            DataOutputStream out = new DataOutputStream(new FileOutputStream(f1));


            out.writeUTF("Row 1 qwe");
            out.writeUTF("Test row 2 qz");
            out.writeDouble(2);
            out.writeDouble(3425.324);
            out.writeDouble(9545);
            out.close();

            File f2 = new File("E:\\Study_2022\\Files\\File2.txt");

            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            out = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    Double num = rd.readDouble();

                    if (num > 0) {
                        out.writeDouble(num);
                    }
                    break;
                }
            } catch (IOException e) {
            }
        } catch (IOException e) {
            System.out.println("End of file");
        }


    }
}*/



 /*   Создать проект, позволяющий из одного, предварительно
    созданного программными средствами файла, переписать данные,
        соответствующие условию - в исходном файле содержится две строки в
        формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
        вторую строку и положительные числа.*/