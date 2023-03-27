package Lab_Work_9.Task_1.Example_12;

public class Main {
    public static void m(String str, double chislo) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Строка введена неверно");
        }
        try{
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }

        }catch (IllegalArgumentException e) {
            System.out.println("Неверное число");
        }


    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
