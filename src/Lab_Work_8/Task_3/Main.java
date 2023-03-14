package Lab_Work_8.Task_3;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/Lab_Work_8/Task_3/input.txt";
        String outputFileName = "src/Lab_Work_8/Task_3/output.txt";

        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));


        int l = 8; //inputFileName.length(); Нужно найти счетчик строк исходного файла

        /*while (br.readLine() != null) {
            br.readLine();
            l++;
        }
        System.out.println(l);*/

        String[] s = new String[l];
        for (int i = 0; i < l; i++) {
            s[i] = Arrays.toString(br.readLine().split(" "));
            bw.write(s[i]);
            bw.newLine();
        }
        br.close();
        bw.close();
    }

}



/*    Создать проект, позволяющий из одного текстового файла,
    содержащего несколько строк (тип String) заранее подготовленного текста
    на русском языке (Пушкин, Лермонтов или другой российсмки классик на
        Ваш вкус), построчно переписать в другой текстовый файл слова
    начинающиеся с согласных букв..
        Требования:
        – слова из предложения выделять методом split();
        – в новом файле следует указать номер строки, в которой иско- мые
        слова находились в исходном файле;
        – для каждой строки указать количество выбранных слов.*/
