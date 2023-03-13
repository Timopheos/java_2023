package Lab_Work_8.Task_1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        File f1 = new File("E:\\Study_2022\\Files\\File1.txt");
        f1.createNewFile();
        DataOutputStream out = new DataOutputStream(new FileOutputStream(f1));

        out.writeUTF("Shawerma");
        out.writeUTF("Tesrow");
        out.writeDouble(2.654654);
        out.writeDouble(3425.324);
        out.writeDouble(545);


        File f2 = new File("E:\\Study_2022\\Files\\File2.txt");
        f2.createNewFile();
        DataInputStream in = new DataInputStream(new FileInputStream(f1));
        DataOutputStream out2 = new DataOutputStream(new FileOutputStream(f2));

        String s1 = in.readUTF();
        String s2 = in.readUTF();
        Double s3 = in.readDouble();
        Double s4 = in.readDouble();
        Double s5 = in.readDouble();

        Double[] d1 = new Double[3];
        d1[0] = s3;
        d1[1] = s4;
        d1[2] = s5;

        Arrays.sort(d1);


        out2.writeUTF(s2);
        out2.writeDouble(d1[2]);
        DataInputStream in2 = new DataInputStream(new FileInputStream(f2));
        String d21 = in2.readUTF();
        Double d22 = in2.readDouble();
        System.out.println(d21);
        System.out.println(d22);


        in.close();
        out.close();
        out2.close();

    }
}



 /*   Создать проект, позволяющий из одного, предварительно
    созданного программными средствами файла, переписать данные,
        соответствующие условию - в исходном файле содержится две строки в
        формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
        вторую строку и положительные числа.*/