package Lab_Work_7.Task_2;

public class Main {
    public static void main(String[] args) {


        SuperClass superClassObject = new SuperClass("super конструктор");
        SubClass subClassObject = new SubClass("sub конструктор", 12);

        System.out.println(superClassObject.toString());
        System.out.println("Длина строки " + superClassObject.getStringLength() + "\n");

        superClassObject.setStr("super значение методом");
        System.out.println(superClassObject.toString());
        System.out.println("Длина строки " + superClassObject.getStringLength() + "\n");

        System.out.println("Вызов метода без параметра: " + subClassObject.getStr() + "\n");

        subClassObject.setStr("Привет");
        System.out.println("str после вызова метода с текстовым параметром: " + subClassObject.getStr() + "\n");

        System.out.println("Метод с числовым параметром: " + subClassObject.getInt1(48) + "\n");

        subClassObject.res("Привет 2",14);
        System.out.println("После вызова res поле str = " + subClassObject.getStr());
        System.out.println("После вызова res поле int1 = " + subClassObject.getInt1());














    }
}