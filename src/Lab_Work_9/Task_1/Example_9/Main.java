package Lab_Work_9.Task_1.Example_9;

public class Main {
    public static int m() {
        try {
            System.out.println("0");
            return 55;    // выход из метода
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

