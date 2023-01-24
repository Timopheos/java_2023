package Lab_Work_7.Task_5;

public class SuperClass {
    private String str1;

    public SuperClass(String str2) {
        this.str1 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public void info1() {
        System.out.println(this.getClass().getSimpleName() + "\n" + "str 1 = " + str1);
    }

}
