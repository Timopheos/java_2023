package Lab_Work_7.Task_5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Hello");
        superClass.info1();

        SubClass subClass = new SubClass("Hello Again", 12);
        subClass.info1();

        SubClass2 subClass2 = new SubClass2("Goodbye", 'B');
        subClass2.info1();

        SuperClass SuperSubClass = new SubClass("ble", 14);
        SuperSubClass.info1();

        SuperClass SuperSubClass2 = new SubClass2("Zap", 'C');
        SuperSubClass2.info1();
    }
}
