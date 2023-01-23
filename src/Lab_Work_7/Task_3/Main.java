package Lab_Work_7.Task_3;

public class Main {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass(45);
        String className = superClass.toString();
        System.out.println(className + "\n");

        SubClass subClass = new SubClass(23, 'B');
        String subClassName = subClass.toString();
        System.out.println(subClassName + "\n");

        SubClass2 subClass2 = new SubClass2(68, 'c', "Goodbye");
        String subClassName2 = subClass2.toString();
        System.out.println(subClassName2);
    }
}
