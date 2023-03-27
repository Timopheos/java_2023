package Lab_Work_9.Task_1.Example_8;


public class Main {
    public static int m() {
        try {

            System.out.println("0");
            throw new RuntimeException();

        } finally {
            System.out.println("1");
        }

    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

