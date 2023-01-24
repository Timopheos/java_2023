package Lab_Work_7.Task_4;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass('A');
        System.out.println("SuperClass " + "\n" + superClass.toString());

        superClass.copySuperClass('B');
        System.out.println("Копия " + "\n" + superClass);

        SubClass subClass = new SubClass('C', "Hello");
        System.out.println("SubClass " + "\n" + subClass.toString() + "\n");

        subClass.copySubClass('D', "Hello Again");
        System.out.println("Копия " + "\n" + subClass + "\n");

        SubClass2 subClass2 = new SubClass2('E', "Goodbye", 10);
        System.out.println("SubClass 2 " + "\n" + subClass2.toString() + "\n");

        subClass2.copySubClass2('F', "Goodbye Again", 15);
        System.out.println("Копия " + "\n" + subClass2);

    }
}
