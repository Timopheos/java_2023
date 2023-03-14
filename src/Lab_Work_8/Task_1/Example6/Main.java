package Lab_Work_8.Task_1.Example6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("E:\\Read1.txt");
            out = new FileWriter("E:\\Write1.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write((char) oneByte);
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!! ");
        } finally {
            in.close();
            out.close();
        }

    }
}
