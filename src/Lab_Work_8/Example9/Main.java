package Lab_Work_8.Example9;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\Read3.txt"), "cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\Write3.txt"), "cp1251"));

            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error!!!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}


